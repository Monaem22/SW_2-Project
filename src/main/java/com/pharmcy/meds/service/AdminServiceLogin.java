package com.pharmcy.meds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmcy.meds.PatientAndAdminLogin;
import com.pharmcy.meds.model.Admin;
import com.pharmcy.meds.repository.AdminRepository;

@Service
public class AdminServiceLogin implements PatientAndAdminLogin {

	@Autowired
	private AdminRepository adminRepository;

	public String login(String adminName, String password) {
		Admin admin = adminRepository.findByname(adminName);
		if (admin == null) {
			return "Admin not found ";
		} else if (!password.equals(admin.getPassword())) {
			return "Invalid password";
		} else {

			return "Welcom " + admin.getName() + " Your Email :" + admin.getEmail();
		}
	}

}
