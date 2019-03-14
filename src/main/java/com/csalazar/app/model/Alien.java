package com.csalazar.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALIEN")
public class Alien {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;

		
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



	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	
	
}
