package com.kiran.general.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiran
 *
 */
public class CompareTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		int aResult = 0, bResult = 0;
		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i))
				aResult += 1;
			else if (a.get(i) < b.get(i))
				bResult += 1;
		}
		result.add(aResult);
		result.add(bResult);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		List<Integer> a = new ArrayList<Integer>();
		/*
		 * a.add(5); a.add(6); a.add(7);
		 */
		a.add(17);
		a.add(28);
		a.add(30);

		List<Integer> b = new ArrayList<Integer>();
		/*
		 * b.add(3); b.add(6); b.add(10);
		 */
		b.add(99);
		b.add(16);
		b.add(8);

		List<Integer> result = compareTriplets(a, b);
		System.out.println("Result: ([Alice's Score] [Bob's Score])");
		result.stream().forEach(r -> {
			System.out.print
			(r + " ");
		});
	}

}
