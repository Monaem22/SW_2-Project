package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.service.PatientServiceLogin;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/patient")
public class PatientControllerLogin {

	@Autowired
	private PatientServiceLogin patientServiceLogin;

	@GetMapping("/PatientLogin")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String login(@RequestParam String name, @RequestParam String password) {
		return patientServiceLogin.login(name, password);
	}

	
	

}
