/**
 * 
 */
package com.kiran.general.hackerrank.warmup;

import java.util.*;

/**
 * @author Kiran
 *
 */
public class JumpingClouds {

	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	List<Integer> clouds = new ArrayList<Integer>();
    	for(int i = 0; i < c.length; i++) {
    		if(c[i] == 0/* && (i!= 0 && i != (c.length - 1) && c[i-1] !=0 && c[i+1] != 0)*/) {
    			if(i == 0 || i == (c.length - 1))
    				clouds.add(c[i]);
    			else if(c[i-1] == 0 && c[i+1] == 0)
    				continue;
    			else
    				clouds.add(c[i]);
    		}
    	}
    	return (clouds.size() - 1);
    }
    
    public static void main(String[] args) {
    	int n = 7;
    	int[] c = new int[n];
    	String[] cItems = "0 0 1 0 0 1 0".split(" ");
    	for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
    	System.out.println("the minimum number of jumps needed to win the game: " + jumpingOnClouds(c));
	}

}
