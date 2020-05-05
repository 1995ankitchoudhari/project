package com.jbk.hibernate;
// Generated 2 May, 2020 12:04:45 PM by Hibernate Tools 5.3.0.Beta2

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * Country generated by hbm2java
 */

@Entity
@Table(name = "country", catalog = "mvcwithhibernate")
public class Country implements java.io.Serializable {

	private Integer cid;
	private String state;


	public Country() {
	}

	public Country(String state) {
		this.state = state;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Column(name = "state", nullable = false, length = 45)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", state=" + state + " ]";
	}

	
	
	
	
	


	
	
	
	

	

	
	
	
	

}

