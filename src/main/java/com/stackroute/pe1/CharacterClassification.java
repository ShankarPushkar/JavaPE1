package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterClassification {
    public String characterClassifier(char c){



            boolean check1 = Character.isDigit(c);
            if (check1) return ("This is number");
            else {
                int convert = c;
                if (convert < 91 && convert > 64) return ("The Character is Uppercase");
                else if (convert < 123 && convert > 96) return ("The Character is Lowercase");
                else return ("Character is symbol");
            }
    }

}
