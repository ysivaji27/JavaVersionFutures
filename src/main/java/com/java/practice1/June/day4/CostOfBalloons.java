package com.java.practice1.June.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CostOfBalloons {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases =Integer.parseInt(br.readLine());
        List<Integer> totalPriceList  = new ArrayList<>();
        for (int p = 0; p < numberOfTestCases; p++) {
            String[] costs = br.readLine().split("\\s+");
            int cost1 = Integer.parseInt(costs[0]);
            int cost2 = Integer.parseInt(costs[1]);
            int minCost = Math.min(cost1,cost2);
            int maxCost = Math.max(cost1,cost2);
            int  numberOfParticipants = Integer.parseInt(br.readLine());
            int greenBCount = 0;
            int purpleBCount = 0;
            int totalCost = 0;
            for (int i = 0; i < numberOfParticipants; i++) {
                String[] problems = br.readLine().split("\\s+");
                int problem1 = Integer.parseInt(problems[0]);
                int problem2 = Integer.parseInt(problems[1]);
                greenBCount += problem1;
                purpleBCount += problem2;
            }
            if(greenBCount > purpleBCount){
                 totalCost =   (greenBCount * minCost) +(purpleBCount * maxCost);
            }else{
                 totalCost =     (purpleBCount * minCost) +(greenBCount * maxCost);
            }
            totalPriceList.add(totalCost);
        }
        for (Integer integer : totalPriceList) {
            System.out.println(integer);
        }
    }
}
