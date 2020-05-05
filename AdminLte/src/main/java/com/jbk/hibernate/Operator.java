package com.jbk.hibernate;
// default package
// Generated 4 May, 2020 8:07:08 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Operator generated by hbm2java
 */
@Entity
@Table(name = "operator", catalog = "mvcwithhibernate")
public class Operator implements java.io.Serializable {

	private Integer id;
	private String person;
	private String for_;
	private String waytoConnect;
	private String whatsaap;
	private String phonecall;
	private String sms;
	private String email;
	private String timeing;

	public Operator() {
	}

	public Operator(String person, String for_, String waytoConnect, String whatsaap, String phonecall, String sms,
			String email, String timeing) {
		this.person = person;
		this.for_ = for_;
		this.waytoConnect = waytoConnect;
		this.whatsaap = whatsaap;
		this.phonecall = phonecall;
		this.sms = sms;
		this.email = email;
		this.timeing = timeing;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Person", nullable = false, length = 45)
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Column(name = "For", nullable = false, length = 45)
	public String getFor_() {
		return this.for_;
	}

	public void setFor_(String for_) {
		this.for_ = for_;
	}

	@Column(name = "WaytoConnect", nullable = false, length = 45)
	public String getWaytoConnect() {
		return this.waytoConnect;
	}

	public void setWaytoConnect(String waytoConnect) {
		this.waytoConnect = waytoConnect;
	}

	@Column(name = "whatsaap", nullable = false, length = 45)
	public String getWhatsaap() {
		return this.whatsaap;
	}

	public void setWhatsaap(String whatsaap) {
		this.whatsaap = whatsaap;
	}

	@Column(name = "phonecall", nullable = false, length = 45)
	public String getPhonecall() {
		return this.phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
	}

	@Column(name = "sms", nullable = false, length = 45)
	public String getSms() {
		return this.sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "timeing", nullable = false, length = 45)
	public String getTimeing() {
		return this.timeing;
	}

	public void setTimeing(String timeing) {
		this.timeing = timeing;
	}

	@Override
	public String toString() {
		return "Operator [id=" + id + ", person=" + person + ", for_=" + for_ + ", waytoConnect=" + waytoConnect
				+ ", whatsaap=" + whatsaap + ", phonecall=" + phonecall + ", sms=" + sms + ", email=" + email
				+ ", timeing=" + timeing + "]";
	}
	
	

}