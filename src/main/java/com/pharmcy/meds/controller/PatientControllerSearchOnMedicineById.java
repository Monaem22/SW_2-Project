package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.service.PatientServiceSearchOnMedicineById;

@RestController
@RequestMapping("/ManageMedicine")
public class PatientControllerSearchOnMedicineById {

	@Autowired
	private PatientServiceSearchOnMedicineById patientServiceSearchOnMedicineById;

	@GetMapping("/SearchMedicineById")
	public Medicine SearchOnMedicineById(@RequestParam Integer id) {
		return patientServiceSearchOnMedicineById.CheckOnMedicineById(id);
	}

	
	@GetMapping("/SearchById")
	public Patient SearchOnById(@RequestParam Integer id) {
		return patientServiceSearchOnMedicineById.CheckOnById(id);
	}
}
