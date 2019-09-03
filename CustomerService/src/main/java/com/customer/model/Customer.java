package com.customer.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="CUSTOMER")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id//Pk
	@Column(name="CUSTOMERID")
	Integer customerId;
	
	@Column(name="CUSTOMERNAME")
	String customerName;
	
	@Column(name="MOBILE")
	String mobile;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="CITY")
	String city;
	
	@Transient
	List<Account> account;
	
	
}