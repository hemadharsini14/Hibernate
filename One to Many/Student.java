package Hibdemo.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int roll_no;
	@OneToMany 
	private List<Laptop> lap = new LinkedList<Laptop>();
	
	
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
	/*public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}*/
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(ArrayList<Laptop> lap) {
		this.lap = lap;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll_no=" + roll_no + ", lap=" + lap + "]";
	}
	
	

}
