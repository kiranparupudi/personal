package com.kiran.general.hackerrank;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Kiran
 *
 */
public class SimpleArraySum {

	/**
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		//return Arrays.stream(ar).sum();
		return IntStream.of(ar).sum();
		//return IntStream.of(ar).reduce(1, (x, y)->x*y);
	}

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * int[] ar = new int[args.length];
		 * 
		 * for (int arItr = 0; arItr < args.length; arItr++) { int arItem =
		 * Integer.parseInt(args[arItr].trim()); ar[arItr] = arItem; }
		 */

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		System.out.println("Result: " + simpleArraySum(ar));

	}

}
