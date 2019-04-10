/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class PartitionArray {

	public static boolean canThreePartsEqualSum(int[] A) {
		int sum = 0;
		for(int i : A) {
			sum += i;
		}
		if(sum % 3 == 0) {
			int sum1 = 0, sum2 = 0;
			for(int i = 0, j = (A.length - 1); (j - i) >= 1; i++, j--) {
				if(sum1 != (sum / 3))
					sum1 += A[i];
				else
					i -= 1;
				if(sum2 != (sum / 3))
					sum2 += A[j];
				else
					j += 1;
				if(sum1 == (sum / 3) && sum2 == (sum / 3)) {
					return Boolean.TRUE;
				}
			}
			return Boolean.FALSE;
		} else
			return Boolean.FALSE;
	}
	
	public static void main(String[] args) {
		int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
		//int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
		//int[] A = {3,3,6,5,-2,2,5,1,-9,4};
		System.out.println("Can partition the given array into three parts of EqualSum: " + canThreePartsEqualSum(A));
	}

}
