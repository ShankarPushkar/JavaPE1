package com.stackroute.pe1;

public class Triming {

        public String stringTrimmer(String input,int num){
            if(input==null) return ("String Cannot be Null");
            if (num==0) return ("Number cannot be Zero");
            int length=input.length();
            for (int i = 0; i <num ; i++) {
            int temp=num-1;
            do {
                char result = input.charAt(temp);
                temp++;
            }while (length!=temp);
        }
            return ("Works");
    }
}

