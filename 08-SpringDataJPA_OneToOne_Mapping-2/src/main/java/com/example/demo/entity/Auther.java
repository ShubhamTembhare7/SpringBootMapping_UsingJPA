package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auther {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int aid;
	
 private String fname;
 private String lname;
public Auther() {
	super();
	// TODO Auto-generated constructor stub
}
public Auther(int aid, String fname, String lname) {
	super();
	this.aid = aid;
	this.fname = fname;
	this.lname = lname;
}
@Override
public String toString() {
	return "Auther [aid=" + aid + ", fname=" + fname + ", lname=" + lname + "]";
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
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
 
 
}
