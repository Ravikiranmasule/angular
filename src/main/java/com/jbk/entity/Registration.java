package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Registration {
	        @Id
	        @GeneratedValue(strategy=GenerationType.AUTO)
	        Long  id ;//=> primary key 
	        @Column(nullable=false)
			String fname;
	        @Column(nullable=false)
			String lname;
	        @Column(nullable=false)
			String gender;
	        @Column(nullable=false)
			String emailid;//=> String => unique
	        @Column(nullable=false)
			String password; //=> String 
	        @Column(nullable=false)
			Long mobileno; //=> string 
	        @Column(nullable=false)
			String createdby;
	        @Column(nullable=false)
			String createddate; //=> date 
	        @Column(nullable=false)
			String updatatedby; //=> string 
	        @Column(nullable=false)
			String updatateddate;  //=> date 
			
             public Registration() {
	// TODO Auto-generated constructor stub
              }

			public Registration(Long id, String fname, String lname, String gender, String emailid, String password,
					Long mobileno, String createdby, String createddate, String updatatedby, String updatateddate) {
				super();
				this.id = id;
				this.fname = fname;
				this.lname = lname;
				this.gender = gender;
				this.emailid = emailid;
				this.password = password;
				this.mobileno = mobileno;
				this.createdby = createdby;
				this.createddate = createddate;
				this.updatatedby = updatatedby;
				this.updatateddate = updatateddate;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getEmailid() {
				return emailid;
			}

			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Long getMobileno() {
				return mobileno;
			}

			public void setMobileno(Long mobileno) {
				this.mobileno = mobileno;
			}

			public String getCreatedby() {
				return createdby;
			}

			public void setCreatedby(String createdby) {
				this.createdby = createdby;
			}

			public String getCreateddate() {
				return createddate;
			}

			public void setCreateddate(String createddate) {
				this.createddate = createddate;
			}

			public String getUpdatatedby() {
				return updatatedby;
			}

			public void setUpdatatedby(String updatatedby) {
				this.updatatedby = updatatedby;
			}

			public String getUpdatateddate() {
				return updatateddate;
			}

			public void setUpdatateddate(String updatateddate) {
				this.updatateddate = updatateddate;
			}

			@Override
			public String toString() {
				return "Registration [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender
						+ ", emailid=" + emailid + ", password=" + password + ", mobileno=" + mobileno + ", createdby="
						+ createdby + ", createddate=" + createddate + ", updatatedby=" + updatatedby
						+ ", updatateddate=" + updatateddate + "]";
			}
             
}
