package com.abdullah.webapp.SimpleTagSupport;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.tags.RequestContextAwareTag;


public class ComponentViewGeneric extends RequestContextAwareTag{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected int doStartTagInternal() throws Exception {
		WebApplicationContext webApplicationContext = getRequestContext().getWebApplicationContext();
		AutowireCapableBeanFactory autowireCapableBeanFactory = webApplicationContext.getAutowireCapableBeanFactory();
		autowireCapableBeanFactory.autowireBean(this);
		return EVAL_BODY_INCLUDE;
	}


	



}
