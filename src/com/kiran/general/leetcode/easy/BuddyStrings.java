/**
 * 
 */
package com.kiran.general.leetcode.easy;

import java.util.HashSet;

/**
 * @author parupk01
 *
 */
public class BuddyStrings {

	public static boolean buddyStrings(String A, String B) {
		if(A.length() != B.length())
			return Boolean.FALSE;
		else {
			int mismatchCount = 0;
			HashSet<Character> chars = new HashSet<Character>();
			char A1 = '\u0000', A2= '\u0000', B1 = '\u0000', B2 = '\u0000';
			for(int i = 0; i < A.length(); i++) {
				chars.add(A.charAt(i));
				if(A.charAt(i) != B.charAt(i)) {
					mismatchCount += 1;
					if(mismatchCount == 1) {
						A1 = A.charAt(i);
						B1 = B.charAt(i);
					} else if(mismatchCount == 2) {
						A2 = A.charAt(i);
						B2 = B.charAt(i);
					} else if(mismatchCount > 2)
						return Boolean.FALSE;
				}
			}
			if(mismatchCount == 0) {
				if(chars.size() == A.length())
					return Boolean.FALSE;
				return Boolean.TRUE;
			}
			if(A1 == B2 && A2 == B1)
				return Boolean.TRUE;
			else
				return Boolean.FALSE;
		}
	}

	public static void main(String[] args) {
		//String A = "aaaabc", B = "aaaabc";
		String A = "abcaa", B = "abcbb";
		System.out.println("Buddy String? " + buddyStrings(A,B));
	}

}

