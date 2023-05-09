package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.repository.MedicineRepository;

@Service
public class AdminServiceDeleteAllMedicines {

	@Autowired
	private MedicineRepository medicineRepository;

	public String deleteAllMedicines() {

		this.medicineRepository.deleteAll();
		return "All medicines is deleted ";

	}

}
