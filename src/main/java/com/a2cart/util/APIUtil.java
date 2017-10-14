package com.a2cart.util;

public class APIUtil {
	public static double sumNumber(double a, double b) {

		Double sum = null;
		try {
			sum = a + b;
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
		}

		return sum;
	}
}
