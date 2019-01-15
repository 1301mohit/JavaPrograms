package org.bridgelabz.objectorientedprograms;

/**
 * Purpose: Wheat class
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   10/01/2019
 */
public class Wheats {
	private String name;
	private double weight;
	private double price;
	private double total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double price, double weight) {
		this.total = price * weight;
	}
	
}
