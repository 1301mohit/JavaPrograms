package org.bridgelabz.objectorientedprograms;

public class Pulses {
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
