package com.abdullah.webapp.SimpleTagSupport;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.abdullah.webapp.managers.NewsManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class NewsViewComponent extends ComponentViewGeneric  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private NewsManager newsManager; 
	
	@Override
	public void doFinally() {
		String page="../tags/newslist.jsp";
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		request.setAttribute("news", this.newsManager.getAll());
		request.getRequestDispatcher(page);
		try {
			pageContext.include(page);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	


		
}
