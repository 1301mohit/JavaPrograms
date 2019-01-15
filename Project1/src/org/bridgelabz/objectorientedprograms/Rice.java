package org.bridgelabz.objectorientedprograms;

/**
 * Purpose: Encapsulated class of Rice.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   11/01/2019
 */
public class Rice {
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
	//	total = weight*price;
		return total;
	}
	public void setTotal(double weight, double price) {
		this.total = weight*price;
	}
}
