package com.kiran.general.hackerrank;

import java.util.Scanner;

/**
 * @author Kiran
 *
 */
public class Solution {

	static long solve(double meal_cost, int tip_percent, int tax_percent) {
		return Math.round(meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100));
	}

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println("Meal Cost: " + solve(meal_cost, tip_percent, tax_percent));

		scanner.close();
	}

}
