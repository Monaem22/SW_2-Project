package com.pharmcy.meds.model;

import java.util.List;

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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AdminId", length = 25)
	private Integer AdminId;

	@Column(name = "AdminName", length = 255, unique = true)
	private String name;

	@Column(name = "password", length = 255, unique = true)
	private String password;

	@Column(name = "AdminEmail", length = 445)
	private String email;

//	@OneToMany(mappedBy = "admin" , targetEntity = Medicine.class, cascade =  CascadeType.ALL )
//	private List<Medicine> medicineList ;
//
//	public List<Medicine> getMedicineList() {
//		return medicineList;
//	}
//	public void setMedicineList(List<Medicine> medicineList) {
//		this.medicineList = medicineList;
//	}
	
	public Admin() {

	}

	public Admin(Integer adminId, String name, String password, String email, List<Medicine> medicineList) {
		super();
		AdminId = adminId;
		this.name = name;
		this.password = password;
		this.email = email;
//		this.medicineList = medicineList;
	}

	public Integer getAdminId() {
		return AdminId;
	}

	public void setAdminId(Integer adminId) {
		AdminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
