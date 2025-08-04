package com.java.practice1.June.test11;

import java.io.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for (int i_A = 0; i_A < arr_A.length; i_A++) {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            long out_ = solve(N, A);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static long solve(int N, int[] A) {
        long res = 0;
        for (int num : A) {
            res += num;
        }
        res *= -1;
     //   long res = -Arrays.stream(A).asLongStream().sum();

        long cnt = 0;
        for (int x : A) {
            if (x < 0) {
                cnt += Math.abs(x) / 2;
            } else {
                cnt -= x;
            }
        }
        if (cnt >= 0) {
            return res;
        }
        return -1;
    }
}