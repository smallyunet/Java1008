package com.ychs168.java.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Session声明周期的监听，可以用来统计在线人数
 *
 */
public class Online implements HttpSessionListener {

	private Logger logger = LogManager.getLogger();
	
	/**
	 * 在线人数
	 */
	private Integer number = 0;
	
    /**
     * Default constructor. 
     */
    public Online() {

    }

	/**
	 * 当一个浏览器访问网站时被监听到
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	logger.debug("一个客户端上线");
    	number++;
    	arg0.getSession().getServletContext().setAttribute("online", this.number);
    }

	/**
	 * 当浏览器关闭和session超时后被监听到
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	logger.debug("一个客户端下线");
    	number--;
    	arg0.getSession().getServletContext().setAttribute("online", this.number);
    }
	
}
