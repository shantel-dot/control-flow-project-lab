package com.tts;
public class AsciiChars {


    private static int CapitalChar;

    public static void main(String[] args) {
        //Write a Java program to find ascii value of a char
        char ch = 'A';
        int n = ch;
        System.out.println("Ascii Value of " + ch + " will be " + n);

        char CapitalChar = 'A';
        char SmallChar = 'a';

        //Write a Java program to find the ascii value from A-Z
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((CapitalChar + " : " + 1));
            CapitalChar++;
        }
        //Write a Java program to find the ascii value from a-z
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(SmallChar + " : " + i);
            SmallChar++;
        }
    }
}

/*
public class LotteryNumbers {
    public static void main(String[] args) {
        try {
            Scanner kb = new Scanner(System.in);

            System.out.println("Enter a number between 1-20. ");
            int ch = kb.nextInt();

            int b = (int) (Math.random() * 20) + 1;

            if (ch == b) ;
            System.out.println("Congrats, you have won!");
            } else {}
            System.out.println("Sorry, you didn't have the winning number."
                    + "The winning number is " + b + ".");
        }
        catch(Exception e)
        {
            System.out.println("Invalid input.");
        }
    }
*/
