package Hibdemo.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Laptop {
	@Id
	private int lid;
	private String l_name;
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
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", l_name=" + l_name + "]";
	}
	

}
