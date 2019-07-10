package com.stackroute;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        int length=input.length();
        length-=1;
        do {
            char result = input.charAt(length);
            System.out.print(result);
            length--;

        }while (length!=-1);
    }
}
