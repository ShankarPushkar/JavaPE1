package com.stackroute.pe1;
import java.util.Scanner;

public class ConditionalCheck {
    public String conditionChecker(int num)
    {
        if(num>20 && num<30){
            if(num%2==0) return ("Jerry");
            else return ("Tom");
        }
        else return ("The Number is not between 20 & 30");


    }
}
