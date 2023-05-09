package com.pharmcy.meds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.model.Patient;
import com.pharmcy.meds.repository.MedicineRepository;
import com.pharmcy.meds.repository.PatientRepository;

@Service
public class PatientServiceSearchOnMedicineById {

	@Autowired
	private MedicineRepository medicineRepository;

	public Medicine CheckOnMedicineById(Integer id) {

		Optional<Medicine> medicineId = this.medicineRepository.findById(id);
		if (medicineId.isPresent()) {
			return medicineId.get() ;
		} else {
			System.out.print("  invalid Id 	 ");
			return null ;
		}
	}
	
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient CheckOnById(Integer id) {

		Optional<Patient> medicineId = this.patientRepository.findById(id);
		if (medicineId.isPresent()) {
			return medicineId.get() ;
		} else {
			System.out.print("  invalid Id 	 ");
			return null ;
		}
	}
}
