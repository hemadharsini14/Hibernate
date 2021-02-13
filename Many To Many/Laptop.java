package Hibdemo.demo1;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Laptop {
	@Id
	private int lid;
	private String l_name;
	@ManyToMany
	//private Student stu;
	private List<Student> lap = new LinkedList<Student>();
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	/*public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}*/
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", l_name=" + l_name + "]";
	}
	public List<Student> getLap() {
		return lap;
	}
	public void setLap(List<Student> lap) {
		this.lap = lap;
	}
	

}
