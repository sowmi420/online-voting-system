package org;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Votingpanel {
	@Id
	@Column(name="vot_id")
	private Integer vot_id;
	private String name;
	private String dest;
	private String time;
	public Integer getVot_id() {
		return vot_id;
	}
	public void setVot_id(Integer vot_id) {
		this.vot_id = vot_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
