package Hibdemo.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int roll_no;
	@OneToOne
	private Laptop lap;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
