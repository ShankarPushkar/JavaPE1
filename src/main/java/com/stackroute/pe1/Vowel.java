package com.stackroute.pe1;

import java.util.Scanner;

public class Vowel {
    public String vowelChecker(String input) {
        int length = input.length();
        String sendBack = new String();
        String temp = input.toLowerCase();
        for (int i = 0; i < length; i++) {
            switch (temp.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sendBack = "Vowel";
                    break;
                default:
                    sendBack = "Consonant";
            }
        }

        return sendBack;
    }
}
