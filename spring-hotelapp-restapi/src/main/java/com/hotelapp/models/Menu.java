package com.hotelapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MENU")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id", unique = true)
	private int menuId;
	@Column(name = "menu_name")
	private String menuName;
	@Column(name = "price")
	private double Price;

	public Menu(String menuName, double price) {
		super();
		this.menuName = menuName;
		Price = price;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", Price=" + Price + "]";
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
@ManyToOne
	private Hotel hotel;
}
