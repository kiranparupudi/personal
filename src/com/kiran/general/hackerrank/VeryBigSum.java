package com.kiran.general.hackerrank;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * @author Kiran
 *
 */
public class VeryBigSum {
	
	static long aVeryBigSum(long[] ar) {
		return LongStream.of(ar).sum();
    }
	
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println("Result Sum: " + aVeryBigSum(ar));
	}

}
