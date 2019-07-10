package com.stackroute;

import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int y=1;
        int x = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 when you want to exit");
        do {
            System.out.println("Guess the number between 1-100");
            y = sc.nextInt();
            if (y<x) System.out.println("Number guessed is less than original number");
            else if (y>x) System.out.println("Number guessed is more than original number");
            else System.out.println("You have guessed correctly");
            }while ( y != 0);
        }
    }
