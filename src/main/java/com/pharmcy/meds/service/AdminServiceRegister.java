package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.model.Admin;
import com.pharmcy.meds.repository.AdminRepository;

@Service
public class AdminServiceRegister {

	@Autowired
	private AdminRepository adminRepository;

	public String saveRegisterate(Admin NewAdmin) {

		Admin ExistingAdminName = adminRepository.findByname(NewAdmin.getName());
		Admin ExistingAdminPassword = adminRepository.findByPassword(NewAdmin.getPassword());

		if ( ExistingAdminPassword != null) {
			return "this password is already existing , please enter another password";
		} else if(ExistingAdminName != null)	{
			return "this name is already existing , please enter another name ";
		}
//		List<Medicine> medicineList = new ArrayList<>();
//		NewAdmin.setMedicineList(medicineList);
		adminRepository.save(NewAdmin);
		return "  this Admin is registerated ✅";
		

	}

}
