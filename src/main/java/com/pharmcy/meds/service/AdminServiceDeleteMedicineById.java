package com.pharmcy.meds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.repository.MedicineRepository;

@Service
public class AdminServiceDeleteMedicineById {

	@Autowired
	private MedicineRepository medicineRepository;

	public String deleteMedicineById(Integer id) {
		Optional<Medicine> existingMedicine = medicineRepository.findById(id);
		if (existingMedicine.isPresent()) {
			this.medicineRepository.deleteById(id);
			return "this medicine is deleted ";
		}
		return "Medicine Id not available";

	}

}
