package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;


public class TemperatureConvertion {

	public static void main(String[] args) {
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert Fahrenheit to Celsius");
		System.out.print("Enter your choice:");
		int choice = Utility.getInt();
		switch(choice) {
			case 1:
				System.out.println("Enter temperature in celsius");
				double temperatureInCelsius = Utility.getDouble();
				double Fahrenheit = Utility.temperatureConvertionCToF(temperatureInCelsius);
				System.out.println("\nIn Fahrenheit:"+Fahrenheit);
				break;
			case 2:
				System.out.println("Enter temperature in Fahrenheit");
				double temperatureInFahrenheit = Utility.getDouble();
				double Celsius = Utility.temperatureConvertionFToC(temperatureInFahrenheit);
				System.out.println("\nIn Celsius:"+Celsius);
				break;
			default:
				System.out.println("Please enter right choice");
		}
	}

}
