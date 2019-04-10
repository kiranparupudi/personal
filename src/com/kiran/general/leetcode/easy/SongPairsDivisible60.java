/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class SongPairsDivisible60 {
	
	public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] rem = new int[60];
        for(int i:time) {
        	count += rem[(60 - i % 60) % 60];
            rem[i%60] += 1;
        }
        return count;
    }

	public static void main(String[] args) {
		int[] time = {30,20,150,100,40};
		System.out.println("Pairs: " + numPairsDivisibleBy60(time));
	}

}
