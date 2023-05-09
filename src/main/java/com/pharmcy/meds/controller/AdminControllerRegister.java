package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Admin;
import com.pharmcy.meds.service.AdminServiceRegister;

@RestController
@RequestMapping("/Admin")
public class AdminControllerRegister {

	@Autowired
	private AdminServiceRegister adminServiceRegister;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/registerAdmin")
	public String registerPatient(@RequestBody Admin admin) {
		return 	adminServiceRegister.saveRegisterate(admin);
	}

}
