package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {
    public String stringReverser(String input) {
        String reverse=""
        int length=input.length();
        length-=1;
        do {
            reverse=reverse+input.charAt(length);
            length--;

        }while (length!=-1);
        return reverse;
    }
}
