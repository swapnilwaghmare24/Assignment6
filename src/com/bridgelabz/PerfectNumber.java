package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check for perfect number");
        int number=sc.nextInt();
        int sumDivisor=findPerfect(number);
        if(number==sumDivisor)
            System.out.println(number+" is perfect number");
        else
            System.out.println(number+" is not perfect number");
    }

    private static int findPerfect(int number) {
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
             sum=sum+i;
            }
        }
        return sum;
    }
}
