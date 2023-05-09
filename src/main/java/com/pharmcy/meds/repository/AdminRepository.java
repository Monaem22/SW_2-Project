package com.pharmcy.meds.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmcy.meds.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByname(String name);

	public Admin findByPassword(String Password);

	

}
