/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class Rev32Int {
	
	public static int reverse(int x) {
        boolean negFlag = Boolean.FALSE;
        if(x < 0) {
            negFlag = Boolean.TRUE;
            x *= -1;
        }
        int revX = 0, t_revX = 0;
        while (x != 0) {
        	int digit = x % 10;
            revX = (revX * 10) + digit;
            if((revX - digit)/10 != t_revX)
            	return 0;
            t_revX = revX;
            x /= 10;
        }
        return negFlag ? (revX * -1) : revX;
    }

	public static void main(String[] args) {
		int x = -12345;
		System.out.println("Revers of " + x + ": "  + reverse(x));
	}

}
