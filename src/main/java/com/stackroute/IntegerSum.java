package com.stackroute;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 when you want to exit");
        do {
            System.out.println("Enter the number");
            x = sc.nextInt();
            sum += x;
        } while (x != 0);

        System.out.println("Sum of the numbers is:" + sum);
    }

}
