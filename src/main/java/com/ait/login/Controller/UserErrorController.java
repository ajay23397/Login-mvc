package com.ait.login.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class UserErrorController implements ErrorController {

	@GetMapping("/error")
	public String showError()
	{
		return "LoginError";
		
	}
}
