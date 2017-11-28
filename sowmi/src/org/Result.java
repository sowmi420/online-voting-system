package org;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Result {
	@Id
	@Column(name="vot_id")
	private Integer id;
	private Integer type;
	private Integer count;
	private Integer vot_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getVot_id() {
		return vot_id;
	}
	public void setVot_id(Integer vot_id) {
		this.vot_id = vot_id;
	}
	
}
