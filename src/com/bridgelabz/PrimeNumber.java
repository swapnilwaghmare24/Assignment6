package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check wether prime or not");
        int number=sc.nextInt();
        isPrime(number);
    }

    private static void isPrime(int number) {
        if(number==2)
        {
            System.out.println(number+" is prime");
        }
        else
        {
            for(int i=2;i<number;i++)
            {
                if (number % i == 0)
                {
                    System.out.println(number + " is not prime");
                    return;
                }
                else
                {
                    System.out.println(number + " is prime");
                    return;
                }
            }
        }
    }
}
