package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Admin;
import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.repository.AdminRepository;
import com.pharmcy.meds.repository.MedicineRepository;

@Service
public class AdminServiceAddNewMedicine {

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private AdminRepository adminRepository;

	public String SaveNewMedicine(Medicine medicine, String passwordOfAdmin) {

		Admin loggedInAdmin = adminRepository.findByPassword(passwordOfAdmin);
		Medicine existingMedicine = this.medicineRepository.findByname(medicine.getName());
		if (  loggedInAdmin == null) {
			
			return  "    enter a valid admin Password ";
		}
		else if(existingMedicine != null)  {			
			return " this medicine ' " + existingMedicine.getName() + " ' is already existing ," ;
		}
//		loggedInAdmin.getMedicineList().add(medicine);
//		medicine.setAdmin(loggedInAdmin);
		this.medicineRepository.save(medicine);
		return " Admin Name : " + loggedInAdmin.getName() + " , he added a new medicine  "  ;
	
	}

}




