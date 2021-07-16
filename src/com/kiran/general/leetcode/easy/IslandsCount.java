/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class IslandsCount {
	
	public static int countIslands(int[][] islandsMatrix) {
		int islandsCount = 0;
		for(int i = 0; i < islandsMatrix.length; i++) {
			for(int j = 0; j < islandsMatrix[i].length; j++) {
				if(islandsMatrix[i][j] == 1) {
					crawlNeighbours(islandsMatrix, i, j);
					islandsCount += 1;
				}
			}
		}
		return islandsCount;
	}
	
	public static void crawlNeighbours(int[][] islandsMatrix, int i, int j) {
		if(islandsMatrix[i][j] == 1)
			islandsMatrix[i][j] = 2;
		else
			return;
		//left
		if(j > 0)
			crawlNeighbours(islandsMatrix, i, j - 1);
		//right
		if(j < islandsMatrix.length - 1)
			crawlNeighbours(islandsMatrix, i, j + 1);
		//top
		if(i > 0)
			crawlNeighbours(islandsMatrix, i - 1, j);
		//bottom
		if(i < islandsMatrix.length - 1)
			crawlNeighbours(islandsMatrix, i + 1, j);
	}

	public static void main(String[] args) {
		/*int[][] islandsMatrix = 
				   {{1,1,0,1},
					{1,0,0,0},
					{0,0,1,0},
					{1,0,0,0}};//4*/
		/*int[][] islandsMatrix = 
			   {{1,0,1,0},
				{1,1,0,0},
				{0,0,0,1},
				{1,0,0,0}};//4*/
		int[][] islandsMatrix =
				  {{1,1,1,1,1},
				   {1,0,1,0,0},
				   {1,0,0,1,0},
				   {0,0,0,0,0},
				   {1,0,0,0,0}};//3
		System.out.println("# of Islands: " + countIslands(islandsMatrix));
	}

}
