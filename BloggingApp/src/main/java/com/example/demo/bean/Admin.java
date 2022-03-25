package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	private int userId;
	private String adminName;
	private String adminContact;
	
}
