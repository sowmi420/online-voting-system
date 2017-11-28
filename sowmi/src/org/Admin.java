package org;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Admin {
	@Id
	@Column(name="V_id")
	private String username;
	private String password;
	private Integer V_id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getV_id() {
		return V_id;
	}
	public void setV_id(Integer v_id) {
		V_id = v_id;
	}
	
	
}
