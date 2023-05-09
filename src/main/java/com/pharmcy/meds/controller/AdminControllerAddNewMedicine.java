package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.service.AdminServiceAddNewMedicine;

@RestController
@RequestMapping("/ManageMedicine")
public class AdminControllerAddNewMedicine {

	@Autowired
	private AdminServiceAddNewMedicine adminServiceAddNewMedicine;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/AddNewMedicine/{passwordOfAdmin}")
	public String  AddNewMedicine(@RequestBody Medicine   medicine, @PathVariable String passwordOfAdmin) {
		return adminServiceAddNewMedicine.SaveNewMedicine(medicine, passwordOfAdmin);
	}

}
