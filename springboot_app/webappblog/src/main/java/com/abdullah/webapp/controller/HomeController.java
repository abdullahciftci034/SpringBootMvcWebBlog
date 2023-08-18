package com.abdullah.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping(value = "/",produces="text/html")
	public String home() {
		return "home";
	}
	@GetMapping(value = "/home",produces="text/html")
	public String home1() {
		return "home";
	}
	@GetMapping(value = "/contact",produces="text/html")
	public String contact() {
		return "contact";
	}
	@GetMapping(value = "/about",produces="text/html")
	public String about(HttpServletRequest httpRequest) {
		httpRequest.getSession().setAttribute("merhaba", 1);
		return "about";
	}
	@GetMapping(value = "/login",produces="text/html")
	public String login(HttpServletRequest httpRequest) {
		return "login";
	}
	@GetMapping(value = "/exit",produces="text/html")
	public String exit(HttpServletRequest httpRequest) {
		httpRequest.getSession().invalidate();
		return "home";
	}
	
	
}
