package com.java.practice.hr.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> bookMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            sc.nextLine();
            bookMap.put(name.toLowerCase().replace(" ", ""),phone);
        }
        while(sc.hasNext()) {
            String[] name=sc.nextLine().split("\\s+");
            if(name.length>1){
                if(bookMap.get(name[0]+name[1])!=null){
                    System.out.println(name[0]+" "+name[1]+"="+bookMap.get(name[0]+name[1]));
                }else if(bookMap.get(name[1]+" "+name[0])!=null){
                    System.out.println(name[0]+" "+name[1]+"="+bookMap.get(name[0]+name[1]));
                }else{
                    System.out.println("Not found");
                }
            }else if(bookMap.get(name[0])!=null){
                System.out.println(name[0]+"="+bookMap.get(name[0]));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
