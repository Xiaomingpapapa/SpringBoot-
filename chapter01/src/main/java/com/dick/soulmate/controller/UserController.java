package com.dick.soulmate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dick.soulmate.entity.User;
import com.dick.soulmate.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/allusers")
	public String findAllUser(Model model) {
		
		List<User> users = userService.finaAllUsers();
		if(users != null) {
			model.addAttribute("users", users);
		}
		
		return "hello";
		
	}

}
