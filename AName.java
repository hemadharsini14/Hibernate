package Hibdemo.demo1;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class AName {
	private String fname;
	private String lname;
	private String surname;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "AName [fname=" + fname + ", lname=" + lname + ", surname=" + surname + "]";
	}
	
	
}
