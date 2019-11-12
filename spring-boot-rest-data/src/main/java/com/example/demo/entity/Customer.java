package com.example.demo.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Customer{
	@Id
	@Column(name = "name")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "customer_id")
	private String custId;
	
	@OneToMany(targetEntity=Account.class)
	private List<Account> accounts;
}