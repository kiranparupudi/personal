/**
 * 
 */
package com.kiran.general.hackerrank.warmup;

/**
 * @author Kiran
 *
 */
public class ValleyCount {

	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int result = 0, tempResult = 0;
    	int up = 1, down = -1, curr = 0;
    	for(int i = 0; i < n; i++) {
    		if(s.charAt(i) == 'U')
    			curr += up;
    		else if(s.charAt(i) == 'D')
    			curr += down;
    		if(curr == -1)
    			tempResult = 1;
    		if(curr == 1)
    			tempResult = 0;
    		if(curr == 0 && i != 0)
    			result += tempResult;
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		int n = 12;//8
		String s = "DDUUDDUDUUUD";//UDDDUDUU
		System.out.println("the number of valleys Gary walked through during his hike: " + countingValleys(n, s));
	}

}
