package com.stackroute.pe1;

import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

    public String numberGuesser(int number, int userinput) {

            if (userinput<number) return ("Number guessed is less than original number");
            else if (userinput>number) return ("Number guessed is more than original number");
            else return ("You have guessed correctly");
            }
        }
