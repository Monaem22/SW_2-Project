package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.service.AdminServiceDeleteMedicineById;

@RestController
@RequestMapping("/ManageMedicine")
public class AdminControllerDeleteMedicineById {

	@Autowired
	private AdminServiceDeleteMedicineById adminServiceDeleteMedicineById;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@DeleteMapping("/deleteById")
	public String DeleteMedicineById(@RequestParam Integer id) {
		return adminServiceDeleteMedicineById.deleteMedicineById(id);
	}
}
