package com.stackroute;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        for (int i = 1; i <= x;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }

    }
}