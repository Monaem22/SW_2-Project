package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.PatientAndAdminLogin;
import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.repository.PatientRepository;



@Service
public class PatientServiceLogin implements PatientAndAdminLogin {

	@Autowired
	private PatientRepository patientRepository;

	public String login(String patientname, String password) {
		Patient patient = patientRepository.findByname(patientname);
		if (patient == null) {
			return "Patient not found ";
		} else if (!password.equals(patient.getPassword())) {
			return "Invalid password";
		} else {

			return "Welcom " + patient.getName() + " Your Email :" + patient.getEmail();
		}
	}


	
	
}
