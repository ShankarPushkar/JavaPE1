package com.stackroute.pe1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args)
    {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        input = sc.nextLine();
        int length=input.length();
        String temp=input.toLowerCase();
        for (int i = 0; i < length ; i++) {
            switch (temp.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':System.out.print("Vowel ");
                break;
                default:System.out.print("Consonant ");
                        }
        }



    }
}
