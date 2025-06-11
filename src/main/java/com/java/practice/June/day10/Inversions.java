package com.java.practice.June.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inversions {
    public static void main(String args[]) throws Exception {
        // Array Initialized and Assigned
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCasesCount = Integer.parseInt(br.readLine());
        for (int tesCases = 0; tesCases < testCasesCount; tesCases++) {
            int matrixSize = Integer.parseInt(br.readLine());
            int[][] arr = new int[matrixSize][matrixSize];
            //  int[][] subArray = new int[matrixSize][matrixSize];
            for (int m = 0; m < matrixSize; m++) {
                String[] inputValues = br.readLine().split(" ");
                for (int n = 0; n < matrixSize; n++) {
                    arr[m][n] = Integer.parseInt(inputValues[n]);
                }
            }
            int counter = 0;
            for (int startIndex = 0; startIndex < matrixSize; startIndex++) {
                int[][] subArray = new int[matrixSize - startIndex][matrixSize - startIndex];
                // Rectangle Extraction 1
                for (int xIndex = startIndex,indexX=0; xIndex < matrixSize - startIndex; xIndex++,indexX++) {
                    for (int yIndex = 0,indexY=0; yIndex < matrixSize - startIndex; yIndex++,indexY++) {
                        subArray[indexX][indexY] = arr[xIndex][yIndex];
                    }//end of yIndex
                }//end of xIndex
                printArray(subArray);
            }
            //  System.out.println("Final:" + counter);
        }
    }

    private static void printArray(int[][] subArray) {

        for (int printx = 0; printx < subArray.length; printx++) {
            for (int printy = 0; printy < subArray.length; printy++) {
                System.out.print(subArray[printx][printy] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------");
    }
}
