package org;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Candidate {
	@Id
	@Column(name="vot_id")
	private String symbol;
	private String fname;
	private String lname;
	private String gender;
	private String city;
	private Integer pincode;
	private Integer vot_id;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	public Integer getVot_id() {
		return vot_id;
	}
	public void setVot_id(Integer vot_id) {
		this.vot_id = vot_id;
	}
	

}
