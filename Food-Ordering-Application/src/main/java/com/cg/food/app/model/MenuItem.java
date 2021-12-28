package com.cg.food.app.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.food.app.enums.CATEGORY;
import com.cg.food.app.enums.STATUS;

@Entity
@Table(name="menu_items")
public class MenuItem {
	
	@Id
	private long menuItemId;
	private String itemName;
	private STATUS status;
	private double price;
	private CATEGORY category;

	public MenuItem() {
	// TODO Auto-generated constructor stub
	}

	public long getMenuItemId() {
	return menuItemId;
	}

	public void setMenuItemId(long menuItemId) {
	this.menuItemId = menuItemId;
	}

	public String getItemName() {
	return itemName;
	}

	public void setItemName(String itemName) {
	this.itemName = itemName;
	}

	public STATUS getStatus() {
	return status;
	}

	public void setStatus(STATUS status) {
	this.status = status;
	}

	public double getPrice() {
	return price;
	}

	public void setPrice(double price) {
	this.price = price;
	}

	public CATEGORY getCategory() {
	return category;
	}

	public void setCategory(CATEGORY category) {
	this.category = category;
	}

	@Override
	public String toString() {
	return "MenuItem [menuItemId=" + menuItemId + ", itemName=" + itemName + ", status=" + status + ", price="
	+ price + ", category=" + category + ", getMenuItemId()=" + getMenuItemId() + ", getItemName()="
	+ getItemName() + ", getStatus()=" + getStatus() + ", getPrice()=" + getPrice() + ", getCategory()="
	+ getCategory() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
	+ super.toString() + "]";
	}

	public MenuItem(long menuItemId, String itemName, STATUS status, double price, CATEGORY category) {
	super();
	this.menuItemId = menuItemId;
	this.itemName = itemName;
	this.status = status;
	this.price = price;
	this.category = category;
	}



}
