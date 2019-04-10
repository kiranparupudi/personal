/**
 * 
 */
package com.kiran.general.hackerrank.warmup;

/**
 * @author Kiran
 *
 */
public class RepeatedString {
	
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long tempCount = 0, residualCount = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'a')
    			tempCount += 1;
    		if(i == (n % s.length()) - 1)
    			residualCount = tempCount;
    	}
    	return (((n / s.length()) * tempCount) + residualCount);
    }

	public static void main(String[] args) {
		String s = "abcac";//"aba";//"a";
		long n = 10l;//1000000000000l;
		System.out.println("The number of letter a's in repeating the given string: " + repeatedString(s, n));
	}

}
