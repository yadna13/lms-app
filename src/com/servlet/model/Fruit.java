package com.servlet.model;

import java.sql.Timestamp;

//POJO- plain old java object
public class Fruit {

	private int sno;
	private String name;
	private int price;
	private String taste;
	private int quantity;
	private String pcity;
	private Timestamp doe;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "Fruit [sno=" + sno + ", name=" + name + ", price=" + price + ", taste=" + taste + ", quantity="
				+ quantity + ", pcity=" + pcity + ", doe=" + doe + "]";
	}

}
