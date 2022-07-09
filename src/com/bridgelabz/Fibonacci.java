package com.bridgelabz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci series number required");
        int count=sc.nextInt();
        int prev=0;
        int current=1;
        calFibonacci(prev,current,count);

    }

    private static void calFibonacci(int prev, int current, int count) {
        if(count==0)
        {
            return;
        }
        System.out.print(prev+"\t");
        calFibonacci(current,current+prev,--count);
    }
}
