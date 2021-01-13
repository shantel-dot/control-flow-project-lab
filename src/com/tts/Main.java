package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println("Hello " + userName);
        int bn = 5;

        while (bn > 4) {
            System.out.println("Would you like to play? y/n");
            String play = scanner.next();
            if (play.equals("y")) {
                System.out.println("Do you have a red car? (y/n");
                String car = scanner.next();
                System.out.println("What is the name of your favorite pet?");
                String pet = scanner.next();
                int lot2 = pet.charAt(2);
                if (lot2 > 65) {
                    lot2 = lot2 = 65;
                } else {
                }
                System.out.println("How old is your pet?");
                int petAge = scanner.nextInt();
                System.out.println("What is your lucky number?");
                int modNum = scanner.nextInt();
                int luckyNum = 0;
                int lot1 = luckyNum + modNum;
                if (lot1 > 65) {
                    lot1 = lot1 - 65;
                } else {
                }
                int lot3 = petAge + luckyNum;
                if (lot3 > 65) {
                    lot3 = lot3 = 65;
                } else {
                }
                System.out.println("What is the name of your favorite actor/actress?");
                String favAct = scanner.next();
                int lot4 = favAct.charAt(0);
                if (lot4 > 65) {
                    lot4 = lot4 = 65;
                } else {
                }
                System.out.println("Enter a random number between 1-20");
                int ranNum = scanner.nextInt();
                System.out.println("Do you have a favorite quarterback? y/n");
                String favQb = scanner.next();
                if (favQb.equals("y")) {
                    System.out.println("What is their jersey number?");
                    int qbNum = scanner.nextInt();
                    int magNum = qbNum + ranNum;
                    if (magNum > 65) {
                        magNum = magNum - 65;
                    } else {
                    }
                    System.out.println("Your lottery numbers are: 36" + lot1 + lot2 + lot3 + lot4 + "Magic Ball:" + magNum);
                } else {
                }
                System.out.println("How do you like your quarterback?");
                int magNum = luckyNum = ranNum;
                if (magNum > 65) {
                    magNum = magNum - 65;
                } else {
                }
                System.out.println("Your lottery numbers are 36" + lot1 + lot2 + lot3 + lot4 + "Magic Ball:" + magNum);
            }
            }
        String play = null;
        if (play.equals("n")) {
            System.out.println("Game over. Thanks for playing!");
            bn = 1;
        }else{}



    }
}


