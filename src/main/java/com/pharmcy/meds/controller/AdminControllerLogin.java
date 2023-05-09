package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.service.AdminServiceLogin;

@RestController
@RequestMapping("/Admin")
public class AdminControllerLogin {

	@Autowired
	private AdminServiceLogin adminServiceLogin;

	@GetMapping("/adminLogin")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String login(@RequestParam String name, @RequestParam String password) {
		return adminServiceLogin.login(name, password);
	}

}
