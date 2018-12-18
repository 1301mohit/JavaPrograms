package org.bridgelabz.functional;

public class WindChill {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if(t > 50) {
			throw new IllegalArgumentException("please enter temperature less than 51");	
		}
		if(v > 120 || v < 3) {
			throw new IllegalArgumentException("please enter temperature less than 121 and greater than 3");
		}
		double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) *(Math.pow(v,0.18));
		System.out.println(w);
	}
}
