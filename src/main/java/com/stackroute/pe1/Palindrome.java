package com.stackroute.pe1;

public class Palindrome {
    public String palindromeChecker(int number)
    {
        if (number==0)return ("Error! Don't input Zero");
        int remain;
        int reverse=0;
        int sum=0;
        int temp=number;
        while(temp !=0){
            remain=temp%10;
            reverse=(reverse*10)+remain;
            if(remain%2==0){
                sum+=remain;
            }
            temp/=10;
        }
        if (reverse==number){
            if(sum<25){
                return ("The Number is Palindrome and the sum is less than 25");
            }
            return ("The Number is Palindrome and the sum is more than 25");
        }
        return ("The Number is not a palindrome");
    }
}
