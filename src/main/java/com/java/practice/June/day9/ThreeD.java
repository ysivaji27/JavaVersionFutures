package com.java.practice.June.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeD {
    public static void main(String[] args) throws IOException {

        // Array Initialized and Assigned
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCasesCount = Integer.parseInt(br.readLine());
        for (int tesCases = 0; tesCases < testCasesCount; tesCases++) {
            int matrixSize = Integer.parseInt(br.readLine());
            int[][] arr = new int[matrixSize][matrixSize];
            for (int m = 0; m < matrixSize; m++) {
                String[] inputValues = br.readLine().split(" ");
                for (int n = 0; n < matrixSize; n++) {
                    arr[m][n] = Integer.parseInt(inputValues[n]);
                }
            }
            int counter = 0, indexValue = 0;

            for (int startIndex = 0; startIndex < matrixSize; startIndex++) {
                for (int axisPoint = startIndex; axisPoint < matrixSize; axisPoint++) {
                    indexValue = 0;
                    for (int i = axisPoint; i < matrixSize; i++) {
                        for (int j = startIndex; j < matrixSize; j++) {
                            if (indexValue == 0) {
                                indexValue = arr[i][j];
                            } else {
                                if (indexValue > arr[i][j]) {
                                    counter++;
                                }
                            }
                        }
                    }
                }

                for (int axisPoint = 1; axisPoint < matrixSize; axisPoint++) {
                    indexValue = 0;
                    for (int i = 1; i < matrixSize; i++) {
                        for (int j = axisPoint; j < matrixSize; j++) {
                            if (indexValue == 0) {
                                indexValue = arr[i][j];
                            } else {
                                if (indexValue > arr[i][j]) {
                                    counter++;
                                }
                            }
                        }

                    }
                }

            }
            System.out.println(counter);
        }

    }
}
//0,0 - 0,1,-0,2
//1,0 - 1,1,-1,2
//2,0 - 2,1,-2,2

