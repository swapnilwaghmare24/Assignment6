package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        System.out.println("Enter 's' to start the stop watch : ");

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        long startTime = 0, endTime = 0;

        if (ch=='s')
        {
            System.out.println("Stop watch started");

            startTime = System.currentTimeMillis();

            System.out.println("Enter 'e' to end the stop watch : ");
            ch = sc.next().charAt(0);
            if (ch=='e')
            {
                System.out.println("Stop watch ended");

                endTime = System.currentTimeMillis();

                long timeDifference = endTime - startTime;

                int hh = (int) timeDifference / (1000 * 60 * 60);
                int mm = (int) timeDifference / (1000 * 60);
                int ss = (int) timeDifference / 1000;
                int ms = (int) timeDifference % 1000;

                System.out.println(hh + ":" + mm + ":" + ss + ":" + ms);
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
