package com.pharmcy.meds.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "patients")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patientId", length = 25)
	private Integer id;

	@Column(name = "patient_name", length = 255, unique = true)
	private String name;

	@Column(name = "password", length = 255, nullable = false)
	private String password;

	@Column(name = "patient_email", length = 445)
	private String email;
	
//	 mappedBy = "patientId",            
//	@OneToMany(targetEntity = Medicine.class , cascade =  CascadeType.ALL )
//	@JoinColumn(name = "pa_id" ,referencedColumnName = "id" )
//	private List<Medicine> medicineList ;
//
//	public List<Medicine> getMedicineList() {
//		return medicineList;
//	}
//
//	public void setMedicineList(List<Medicine> medicineList) {
//		this.medicineList = medicineList;
//	}

	public Integer getId() {
		return id;
	}

	public Patient() {
	
	}

	public Patient(Integer id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
