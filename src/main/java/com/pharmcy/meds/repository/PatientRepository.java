package com.pharmcy.meds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmcy.meds.model.Patient;

//@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	public Patient findByname(String name);

	public Patient findByPassword(String Password);

}
