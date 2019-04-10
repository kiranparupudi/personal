package com.kiran.general;

public class RotateSqMatrix {
    
    static int[][] rotateMatrix(int[][] matrix, int n) {
        for(int i = 0; i< (n/2); i++) {
            for(int j = i; j < ((n - i) - 1); j++) {
                int[] temp = {i, j, ((n - 1) - i), ((n - 1) - j)};
                int tempVar1 = matrix[temp[0]][temp[1]];
                for(int k = 0; k < temp.length; k++) {
                    int l = (k == temp.length - 1) ? 0 : (k + 1);
                    int tempVar2 = matrix[temp[l]][temp[(l == temp.length - 1) ? 0 : (l + 1)]];
                    matrix[temp[l]][temp[(l == temp.length - 1) ? 0 : (l + 1)]] = tempVar1;
                    tempVar1 = tempVar2;
                }
            }
        }
        return matrix;
    }
    
    static void printMatrix(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}};
        //int[][] matrix = {{1,2},{3,4}};
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        //int[][] matrix = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
        int n = 1;
        System.out.println("Original Matrix: ");
        printMatrix(matrix, n);
        System.out.println("Rotated Matrix: ");
        printMatrix(rotateMatrix(matrix, n), n);
    }

}