package com.java.practice1.lc.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TESTClass {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int val = nums[i]+nums[j];
                if(val==target){
                    list.add(i);
                    list.add(j);
                }

            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println( twoSum(nums,target));
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(9,l2);

        ListNode l11 = new ListNode(5);
        ListNode l22 = new ListNode(6,l11);
        ListNode l33 = new ListNode(4,l22);
        ListNode l44 = new ListNode(9,l33);
        ListNode result =  addTwoNumbers(l3,l44);
        for (int i = 0; result.next!=null ;i++) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val); // Print the last node value
        String s = "pwwkew";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                Set<Character> substringSet = substring.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
                if (substringSet.size() == substring.length()) {
                    maxLength = Math.max(maxLength, substring.length());
                }
            }
        }

        // second approach using sliding window technique
        int maxLength1 = 0, left1 = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left1));
                left1++;
            }
            seen.add(s.charAt(right));
            maxLength1 = Math.max(maxLength1, right - left1 + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(10));
        sb.reverse();
        int num = 121;
        if(sb.toString().equals(num))
        System.out.println(sb.toString() );
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);


        int[] arr = {1, 2, 3, 2, 1, 4, 5, 5, 4};
        int single_student_number = 0;
        for (int nn : arr) {
            single_student_number ^= nn;
        }
        System.out.println("The number of the student who is not paired: " + single_student_number);
    }

    public static ListNode  addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String s1 ="";
        String s2 ="";
        ListNode node1 = null;
        ListNode node2 = null;
        do{
            s1 = s1+l1.val;
            l1 = l1.next;
        }while(l1!=null);

        do{
            s2 = s2+l2.val;
            l2 = l2.next;
        }while(l2!=null);

        long sum = Integer.parseInt(s1)+Integer.parseInt(s2);
        char[] numChar = String.valueOf(sum).toCharArray();
        ListNode result = null;
        for(int i =0;i<numChar.length;i++){
            if(result == null){
                result = new ListNode(Integer.parseInt(numChar[i]+""));
            }else{
                ListNode temp = new ListNode(Integer.parseInt(numChar[i]+""));
                temp.next = result;
                result = temp;
            }

        }
        for (int i = 0; result.next!=null ;i++) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val); // Print the last node value
        return result;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }