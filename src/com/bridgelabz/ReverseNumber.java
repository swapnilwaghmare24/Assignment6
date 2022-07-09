package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number which you want to reverse");
        int number= sc.nextInt();
        reverse(number);
    }

    private static void reverse(int number) {
        int reverseNum=0;
        int rem=0;
        while(number>0) {
            rem = number % 10;
            reverseNum = rem + reverseNum*10;
            number=number/10;
        }
        System.out.println(reverseNum);
    }
}
