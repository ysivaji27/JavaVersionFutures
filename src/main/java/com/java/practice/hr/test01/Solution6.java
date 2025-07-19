package com.java.practice.hr.test01;

import java.io.*;
import java.util.*;
import static java.lang.System.in;
import java.lang.reflect.*;

class Prime {
    public void checkPrime(int... inputArr){
        boolean isPrime;
        for(int input: inputArr){
            isPrime = true;
            for(int i=2; i*i<=input; i++){
                if(input%i == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && input!=1){
                System.out.print(input + " ");
            }
        }
        System.out.println();
    }
}
public class Solution6 {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}


