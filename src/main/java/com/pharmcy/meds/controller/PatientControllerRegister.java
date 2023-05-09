package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.service.PatientServiceRegister;

@RestController
@RequestMapping("/patient")
public class PatientControllerRegister {

	@Autowired
	private PatientServiceRegister patientServiceRegister;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/registerPatient")
	public String registerPatient(@RequestBody Patient patientModel) {
		return patientServiceRegister.saveRegisterate(patientModel);
	}

}
