package com.pharmcy.meds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.repository.MedicineRepository;

@Service
public class PatientServiceViewAllMedicines {

	@Autowired
	private MedicineRepository medicineRepository;

	public List<Medicine> GetAll() {
		return this.medicineRepository.findAll();

	}
}
