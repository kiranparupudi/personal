package com.kiran.general.leetcode.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        if(nums == null || nums.length < 4)
            return finalList;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length-2; j++) {
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1, l = nums.length-1;
                while(k < l) {
                    if(nums[i] + nums[j] + nums[k] + nums[l] < target)
                        k++;
                    else if(nums[i] + nums[j] + nums[k] + nums[l] > target)
                        l--;
                    else {
                        finalList.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1])
                            k++;
                        while (k < l && nums[l] == nums[l+1])
                            l--;
                    }
                }
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println("List: " + fourSum.fourSum(nums, target));
    }
}
