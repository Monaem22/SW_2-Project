package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.service.PatientServiceModifyProfile;

@RestController
@RequestMapping("/patient")
public class PatientControllerModifyProfile {

	@Autowired
	private PatientServiceModifyProfile patientServiceModifyProfile;

	@PutMapping("/modifyPatient/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String update(@PathVariable Integer id, @RequestBody Patient patientModel) {
		return patientServiceModifyProfile.update(id, patientModel);
	}

}
