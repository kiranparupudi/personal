/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class BitwiseComplement {

	public static int bitwiseComplement(int N) {
		if (N == 0)
			return 1;
		else {
			int compN = 0;
			while (compN < N) {
				compN = (compN * 2) + 1;
			}
			return compN - N;
		}
	}

	public static void main(String[] args) {
		int N = 348;
		System.out.println("Bitwise Complement of " + N + ": " + bitwiseComplement(N));
	}

}
