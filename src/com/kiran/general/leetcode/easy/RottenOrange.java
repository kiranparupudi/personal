/**
 * 
 */
package com.kiran.general.leetcode.easy;

import java.util.ArrayList;

/**
 * @author Kiran
 *
 */
public class RottenOrange {
	
	static int orangesRotting(int[][] grid) {
		int mins = 0;
		int oneCount = 0;
		ArrayList<Integer[]> list1 = new ArrayList<Integer[]>();
		ArrayList<Integer[]> list2 = new ArrayList<Integer[]>();
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					//check neighbours for accessibility
					////if accessible, then increment the counter
					if((j > 0 && grid[i][j-1] != 0)//left
							|| (j < (grid[i].length - 1) && grid[i][j+1] != 0)//right
							|| (i > 0 && grid[i-1][j] != 0)//top
							|| (i < (grid.length - 1) && grid[i+1][j] != 0))//bottom
						oneCount += 1;
					//if not accessible, return -1
					else
						return -1;
				}
				if(grid[i][j] == 2) {
					//store the grid point in list1
					list1.add(new Integer[] {i,j});
				}
			}
		}
		//if no fresh oranges at all, then return 0
		if(oneCount == 0)
			return 0;
		if(list1.isEmpty())
			return -1;
		while(true) {
			list2 = new ArrayList<Integer[]>();
			boolean flag = false;
			for(Integer[] rottenPoint : list1) {
				//if any neighbor is fresh, store the grid point in list2
				if(rottenPoint[1] > 0 && grid[rottenPoint[0]][rottenPoint[1]-1] == 1) {//left
					list2.add(new Integer[] {rottenPoint[0],(rottenPoint[1]-1)});
					grid[rottenPoint[0]][rottenPoint[1]-1] = 2;
					oneCount -= 1;
					flag = true;
				}
				if(rottenPoint[1] < (grid[rottenPoint[0]].length - 1) && grid[rottenPoint[0]][rottenPoint[1]+1] == 1) {//right
					list2.add(new Integer[] {rottenPoint[0],(rottenPoint[1]+1)});
					grid[rottenPoint[0]][rottenPoint[1]+1] = 2;
					oneCount -= 1;
					flag = true;
				}
				if(rottenPoint[0] > 0 && grid[rottenPoint[0]-1][rottenPoint[1]] == 1) {//top
					list2.add(new Integer[] {(rottenPoint[0]-1),rottenPoint[1]});
					grid[rottenPoint[0]-1][rottenPoint[1]] = 2;
					oneCount -= 1;
					flag = true;
				}
				if(rottenPoint[0] < (grid.length - 1) && grid[rottenPoint[0]+1][rottenPoint[1]] == 1) {//bottom
					list2.add(new Integer[] {(rottenPoint[0]+1),rottenPoint[1]});
					grid[rottenPoint[0]+1][rottenPoint[1]] = 2;
					oneCount -= 1;
					flag = true;
				}
				
			}
			if(flag)
				mins += 1;
			if(list2.isEmpty())
				break;
			else {
				list1.clear();
				list1 = list2;
			}
		}
		if(oneCount != 0)
			return -1;
		else
			return mins;
	}

	public static void main(String[] args) {
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println("Minimum # of minutes to rot all oranges: " + orangesRotting(grid));
	}

}
