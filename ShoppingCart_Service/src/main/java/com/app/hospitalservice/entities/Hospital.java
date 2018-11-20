package com.app.hospitalservice.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Badari.Krishna 
 *
 */
@Entity
@Table(name = "hospitals",schema="dbo")
public class Hospital implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private String contactno;

	@Id 
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


}
