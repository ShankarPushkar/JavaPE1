package com.stackroute;

import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {
        char c;
        int x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 when you want to exit");
        do {
            System.out.println("Enter the Character");
            c = sc.next().charAt(0);
            boolean check1 = Character.isDigit(c);
            if (check1) System.out.println("This is a number");
            else {
                int convert = c;
                if (convert < 91 && convert > 64) System.out.println("The Character is Uppercase");
                else if (convert < 123 && convert > 96) System.out.println("The Character is Lowercase");
                else System.out.println("Character is symbol");
            }
        } while (x != 0);
    }

}
