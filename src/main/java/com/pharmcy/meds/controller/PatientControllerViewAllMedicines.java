package com.pharmcy.meds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.service.PatientServiceViewAllMedicines;

@RestController
@RequestMapping("/ManageMedicine")
public class PatientControllerViewAllMedicines {

	@Autowired
	private PatientServiceViewAllMedicines patientServiceViewAllMedicines;

	@GetMapping("/viewAllMedicine")
	public List<Medicine> ViewAllMedicines() {
		return this.patientServiceViewAllMedicines.GetAll();
	}

}
