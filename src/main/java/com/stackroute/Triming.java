package com.stackroute;

import java.util.Scanner;

public class Triming {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String input = sc.nextLine();
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int length=input.length();
            num-=1;
            do {
                char result = input.charAt(num);
                System.out.print(result);
                num++;

            }while (length!=num);
        }
    }

