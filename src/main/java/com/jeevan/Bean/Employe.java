package com.jeevan.Bean;

public class Employe {
	int id;
	String Name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", Name=" + Name + "]";
	}

}
