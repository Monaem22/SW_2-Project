package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.service.AdminServiceDeleteAllMedicines;

@RestController
@RequestMapping("/ManageMedicine")
public class AdminControllerDeleteAllMedicines {

	@Autowired
	private AdminServiceDeleteAllMedicines adminServiceDeleteAllMedicines;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@DeleteMapping("/deleteAll")
	public String DeleteAllMedicines() {
		return adminServiceDeleteAllMedicines.deleteAllMedicines();
	}
}
