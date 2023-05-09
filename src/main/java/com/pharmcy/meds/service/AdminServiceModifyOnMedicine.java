package com.pharmcy.meds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.repository.MedicineRepository;

@Service
public class AdminServiceModifyOnMedicine {

	@Autowired
	private MedicineRepository medicineRepository;

	public String updateDataOfMedicine(Integer id, Medicine medicine) {
		Optional<Medicine> existing = this.medicineRepository.findById(id);
		if (existing.isPresent())
		{
			Medicine existingMedicine = this.medicineRepository.findById(id).get();
			existingMedicine.setName(medicine.getName());
			existingMedicine.setPrice(medicine.getPrice());
			existingMedicine.setDescription(medicine.getDescription());
			 this.medicineRepository.save(existingMedicine);
			 return "this medicine is modified successfully" ;
		} else 
		{
			
			return "please enter valid Medicine id ";
		}
	}

}
