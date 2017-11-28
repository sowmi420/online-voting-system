package org;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Property {
	@Id
	@Column(name="vot_id")
	private Integer id;
	private String p_symbol;
	private String min_age_limit;
	private Integer vot_id;
	private String date;
	private String nationality;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getP_symbol() {
		return p_symbol;
	}
	public void setP_symbol(String p_symbol) {
		this.p_symbol = p_symbol;
	}
	public String getMin_age_limit() {
		return min_age_limit;
	}
	public void setMin_age_limit(String min_age_limit) {
		this.min_age_limit = min_age_limit;
	}
	public Integer getVot_id() {
		return vot_id;
	}
	public void setVot_id(Integer vot_id) {
		this.vot_id = vot_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

}
