package com.ychs168.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filename = request.getParameter("filename");
		logger.debug(filename);
		
		response.setContentType("text/html;chatset=UTF-8");
		
		String newFilename = URLEncoder.encode(filename, "UTF-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + newFilename);
		
		String realPath = request.getServletContext().getRealPath("upload");
		File file = new File(realPath + File.separator + filename);
		InputStream inputStream = new FileInputStream(file);
//		logger.debug(inputStream.available());
		
		byte[] b = new byte[inputStream.available()];
		inputStream.read();
		inputStream.close();
		
		ServletOutputStream out = response.getOutputStream();
		out.write(b);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
