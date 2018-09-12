package com.ychs168.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 文件上传
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 判断提交是否符合文件上传的方式
		boolean uploadFlag = true;
		uploadFlag = ServletFileUpload.isMultipartContent(request);
		if(uploadFlag) {
			// 上传处理
			ServletFileUpload fileUpload = new ServletFileUpload();
			fileUpload.setHeaderEncoding("UTF-8");
			try {
				FileItemIterator it =  fileUpload.getItemIterator(request);
				while(it.hasNext()) {
					FileItemStream stream = it.next();
					String fieldName = stream.getFieldName();
//					logger.debug(fieldName);
					
					InputStream inputStream = stream.openStream();
					if(stream.isFormField()) { // 表单域
						String value = Streams.asString(inputStream, "UTF-8");
//						logger.debug(value);
					} else { // 文件
						String fileName = new File(stream.getName()).getName();
						if(fileName == null) {
							return;
						}
//						logger.debug("fileName -> " + fileName);
						
						String realPath = request.getServletContext().getRealPath("upload");
//						logger.debug("realPath -> " + realPath);
						
						String filePath = realPath + File.separator + fileName;
//						logger.debug("filePath -> " + filePath);
						
						File file = new File(filePath);
						Streams.copy(inputStream, new FileOutputStream(file), true);
						
						logger.debug("upload over");
						
						// 跳转到下载页面，并且展示文件列表
						File downloadPath = new File(realPath);
						File[] files = downloadPath.listFiles();
						String[] filenames = new String[files.length];
						for (int i=0; i < files.length; i++) {
							filenames[i] = files[i].getName();
						}
						
						request.setAttribute("filenames", filenames);
						request.getRequestDispatcher("download.jsp").forward(request, response);
					}
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			response.getWriter().print("bad request");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
