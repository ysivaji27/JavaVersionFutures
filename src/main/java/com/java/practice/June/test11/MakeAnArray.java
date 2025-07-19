package com.java.practice.June.test11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MakeAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int out_ = solve(N, A);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int solve(int N, int[] A){
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];

        }
        int operationsDivisor = N - 1;

        if (sum % operationsDivisor != 0) {
            return -1;
        }
        long x = sum / operationsDivisor;
        for (int i = 0; i < N; i++) {
            if (A[i] > x) {
                return -1;
            }
        }
        return (int) x;
    }
}
