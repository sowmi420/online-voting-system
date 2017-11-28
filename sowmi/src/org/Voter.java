package org;
import javax.persistence.Column;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Embeddable
public class Voter {
	@Id
	@Column(name="V_id")
	private Integer V_id;
	private String fname;
	private String lname;
	private String gender;
	private String city;
	private Integer pincode;
	private String booth;
	private Integer age;
	public Integer getV_id() {
		return V_id;
	}
	public void setV_id(Integer v_id) {
		V_id = v_id;
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
	public String getBooth() {
		return booth;
	}
	public void setBooth(String booth) {
		this.booth = booth;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
