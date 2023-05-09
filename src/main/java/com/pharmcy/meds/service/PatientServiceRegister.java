package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.repository.PatientRepository;

@Service
public class PatientServiceRegister {

	@Autowired
	private PatientRepository patientRepository;

	public String saveRegisterate(Patient newPatient) {

		Patient ExistingPatientName = this.patientRepository.findByname(newPatient.getName());
		Patient ExistingPatientPassword = this.patientRepository.findByPassword(newPatient.getPassword());

		if ( ExistingPatientPassword != null) {
			return "this password is already existing , please enter another password";
		} else if(ExistingPatientName != null ) {
			return "this name is already existing , please enter another name ";
		}
		 patientRepository.save(newPatient);
		 return  "  this patient is registerated ✅ "   ;
		
		
	}

}
