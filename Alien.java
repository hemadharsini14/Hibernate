package Hibdemo.demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien_tab")
public class Alien {
	@Id
	private int id;
	
	//private String name;
	private AName name;
	@Column(name="alien_color")
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
	public String getColor() {
		return color;
	}
	public AName getName() {
		return name;
	}
	public void setName(AName name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
