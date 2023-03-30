package com.ait.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ait.login.Entity.UserLogin;
import com.ait.login.Service.LoginService;

@Controller
public class UserLoginController {
@Autowired
	LoginService service;
@Autowired
UserLogin login;
	@GetMapping( "/login")
	public String getLoginPage()
	{
		return "login";
	}
	@PostMapping("/checklogin")
	public String VerifyLogin(@RequestParam("username")String Username,@RequestParam("password")String password,Model model )
	{
		
		service.checkLogin(Username, password);
		if(Username.equals(login.getUsername()))
		{
			model.addAttribute(Username, password);
			return "Success";
		}
		else {
			
			return "Login";
		}
		
		
		
		
	}
	
}
