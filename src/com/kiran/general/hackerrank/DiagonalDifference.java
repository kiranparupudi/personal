package com.kiran.general.hackerrank;

import java.util.Scanner;

/**
 * @author Kiran
 *
 */
public class DiagonalDifference {

	static int diagonalDifference(int[][] arr) {
		int a = 0, b = 0;
		for(int i=0; i<arr.length; i++) {
			a += arr[i][i];
			b += arr[i][(arr.length - 1) - i];
		}
		return Math.abs(a - b);
	}

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		System.out.println("Diagoanl Difference: " + diagonalDifference(arr));

		scanner.close();
	}

}
