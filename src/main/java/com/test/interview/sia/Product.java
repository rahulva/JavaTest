package com.test.interview.sia;

public class Product {

	public String name;
	public int quantity;

	public Product(String name, int quantity) {
		this.name = name;
//		this.quantity = 1;
		setQuantity(quantity);
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {

		if (quantity < 0) {
			this.quantity = 1;
		} else {
			this.quantity = quantity;
		}
	}

}