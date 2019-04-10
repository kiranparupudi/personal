/**
 * 
 */
package com.kiran.general.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiran
 *
 */
public class PrefixDivbyFive {
	public static List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> results = new ArrayList<Boolean>(A.length);
		for(int i = 0, rem = 0; i < A.length; i++) {
			rem = (rem * 2) + A[i];
			rem = rem - ((rem > 4) ? 5 : 0);
			results.add(rem == 0);
		}
		return results;
	}
	
	public static void main(String[] args) {
		//int[] A = {0, 1, 1};
		int[] A = {1,0,1,0,0,0,0,0,0,0,0,1,1,1,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,1,0,0,1,1,1};
		System.out.println("\nResults: " + prefixesDivBy5(A));
	}
}
