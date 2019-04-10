/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class NonDecreasingArray {
	
	public static boolean checkPossibility(int[] nums) {
        boolean changedFlag = Boolean.FALSE;
        int i=0;
        for(i=0;i<nums.length-1;i++) {
           if(nums[i+1]-nums[i] < 0) {
        	   if(changedFlag)
        		   return Boolean.FALSE;
            	if(i == 0) {
            		nums[i] = nums[i+1];
            		changedFlag = Boolean.TRUE;
            	}else {
            		if(nums[i+1] >= nums[i-1]) {
            			nums[i] = nums[i+1];
            			changedFlag = Boolean.TRUE;
            		} else {
            			nums[i+1] = nums[i];
            			changedFlag = Boolean.TRUE;
            		}
            	}
            }
        }
        return Boolean.TRUE;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,4,3,5};
		System.out.println("Possibility for non-decreasing array: " + checkPossibility(nums));
	}

}
