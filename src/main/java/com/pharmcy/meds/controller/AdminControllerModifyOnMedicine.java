package com.pharmcy.meds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pharmcy.meds.model.Medicine;
import com.pharmcy.meds.service.AdminServiceModifyOnMedicine;

@RestController
@RequestMapping("/Admin")
public class AdminControllerModifyOnMedicine {

	@Autowired
	private AdminServiceModifyOnMedicine adminServiceModifyOnMedicine;

	@PutMapping("/modifyMedicine/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String UpdateDataOfMedicine(@PathVariable Integer id, @RequestBody Medicine medicine) {
		return adminServiceModifyOnMedicine.updateDataOfMedicine(id, medicine);
	}

}
