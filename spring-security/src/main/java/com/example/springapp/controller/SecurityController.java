package com.example.springapp.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@RequestMapping("/")
	public String loginPage()
	{
		return "Welcome!";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}

}
