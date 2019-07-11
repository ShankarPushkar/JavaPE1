package com.stackroute;
import java.util.Scanner;


public class IntergerSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int number=sc.nextInt();
        int i=0;
        int temp;
        int sum=0;
        int[] arr = new int[12];
        do {
            arr[i] = number % 10;
            if(arr[i]%2==0){
                sum+=arr[i];
            }
            number /= 10;
            i++;
        } while (number != 0);

        for ( int k = 0; k < i; k++)
        {
            for (int j = k + 1; j < i; j++)
            {
                if (arr[k] < arr[j])
                {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int j=0;j<i;j++){
            System.out.print(arr[j]);
        }
        System.out.println("\nsum of even numbers "+sum);
        if(sum>15){
            System.out.println("True");
        }else
            System.out.println("False");
    }
}
