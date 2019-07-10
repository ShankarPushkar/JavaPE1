package com.stackroute;
import java.util.Scanner;

public class ConditionalCheck {
    public static void main(String[] args)
    {
        int number=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();

        if(number>20 && number<30){
            if(number%2==0) System.out.println("Jerry");
            else System.out.println("Tom");
        }
        else System.out.println("The Number is not between 20 & 30");


    }
}
