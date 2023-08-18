package com.abdullah.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abdullah.webapp.managers.UserManager;
import com.abdullah.webapp.models.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	private UserManager userManager;
	
	@Autowired
	public UserController(UserManager userManager) {
		super();
		this.userManager = userManager;
	}

	@GetMapping("/save")
	public String getAddUser(User user) {
		userManager.save(user);
		return "user";
	}
	@GetMapping("/login")
	public String userlogin(HttpServletRequest httpRequest,User user) {
		User user1=this.userManager.userLoginControl(user);
		if(user1!=null) {
			httpRequest.getSession().setAttribute("user",user1);
			
			return "home";
		}
		return "login";
	}
}
