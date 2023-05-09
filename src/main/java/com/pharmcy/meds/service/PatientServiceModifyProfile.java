package com.pharmcy.meds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.repository.PatientRepository;

@Service
public class PatientServiceModifyProfile {

	@Autowired
	private PatientRepository patientRepository;

	public String update(Integer id, Patient patientModel) {
		Optional<Patient> existing = this.patientRepository.findById(id);
		if (existing.isPresent()) {
			Patient existingPatient = this.patientRepository.findById(id).get();
			existingPatient.setName(patientModel.getName());
			existingPatient.setEmail(patientModel.getEmail());
			existingPatient.setPassword(patientModel.getPassword());
			 this.patientRepository.save(existingPatient);
			 return  "this Patient is modified successfully";
		} else {
			return "please enter valid Patient Id";
		}

	}

}
