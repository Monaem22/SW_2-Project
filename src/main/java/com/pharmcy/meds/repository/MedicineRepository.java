package com.pharmcy.meds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmcy.meds.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

	public Medicine findByname(String name);
	

}
