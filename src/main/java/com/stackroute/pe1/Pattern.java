package com.stackroute.pe1;

import java.util.Scanner;

public class Pattern {
    public int[] patternBuider(int number) {
        int temp=0;
        int counter=0;
        int[] sendback=new int[10];
        if (number == 0) {
            return sendback;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                sendback[counter]=j;
                counter++;

            }
        }
        return sendback;
    }
}
