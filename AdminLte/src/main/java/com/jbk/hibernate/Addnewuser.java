package com.jbk.hibernate;
// Generated 21 Apr, 2020 10:39:54 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;



/**
 * Addnewuser generated by hbm2java
 */
@Entity
@Table(name = "addnewuser", catalog = "mvcwithhibernate")
public class Addnewuser implements java.io.Serializable {

	private Integer id;
	private Country country;
	private String username;
	private String mobile;
	private String email;
	private String course;
	private String gender;
	private String password;
	private String isdefault="no";

	public Addnewuser() {
	}

	/*public Addnewuser(Country country, String username, String mobile, String email, String course, String gender,
			String password) {
		this.country = country;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
		this.gender = gender;
		this.password = password;
	}*/

	public Addnewuser(Country country, String username, String mobile, String email, String course, String gender,
			String password, String isdefault) {
		this.country = country;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
		this.gender = gender;
		this.password = password;
		this.isdefault = isdefault;
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

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "username", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "mobile", nullable = false, length = 45)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "course", nullable = false, length = 45)
	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Column(name = "gender", nullable = false, length = 45)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ColumnDefault(value="no")
	@Column(name = "isdefault", nullable = false, length = 45)
	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	@Override
	public String toString() {
		return "Addnewuser [id=" + id + ", country=" + country + ", username=" + username + ", mobile=" + mobile
				+ ", email=" + email + ", course=" + course + ", gender=" + gender + ", password=" + password
				+ ", isdefault=" + isdefault + "]";
	}

	

		
}