package com.pharmcy.meds.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "Medicines")
public class Medicine {

	public Medicine() {
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MedicinesId", length = 25)
	private Integer id;

	@Column(name = "name", length = 25, unique = true)
	private String name;

	@Column(name = "description", length = 25)
	private String description;

	@Column(name = "price", length = 25)
	private Integer price;
	
//	@ManyToOne 
//	@JoinColumn (name = "ad_id" ,referencedColumnName = "AdminId" )
//	private Admin admin;
//
//	public Admin getAdmin() {
//		return admin;
//	}
//
//	public void setAdmin(Admin admin) {
//		this.admin = admin;
//	}

	
	public Medicine(Integer id, String name, String description, Integer price, Admin admin) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
//		this.admin = admin;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}




}
