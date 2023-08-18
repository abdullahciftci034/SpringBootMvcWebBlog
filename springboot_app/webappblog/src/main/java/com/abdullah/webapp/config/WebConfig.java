package com.abdullah.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySources({
	@PropertySource(
		    ignoreResourceNotFound = false,
		    value = "classpath:/services-config.properties"),
    @PropertySource(
    	    ignoreResourceNotFound = false,
    	    value = "classpath:/models-config.properties"),
    @PropertySource(
    	    ignoreResourceNotFound = false,
    	    value = "classpath:/repositories-config.properties")
})
public class WebConfig implements WebMvcConfigurer {
	
	@Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/"); // Set the prefix for JSP files
        viewResolver.setSuffix(".jsp"); // Set the suffix for JSP files
        return viewResolver;
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
   
}
