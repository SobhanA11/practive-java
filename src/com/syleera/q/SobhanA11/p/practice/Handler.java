package com.syleera.q.SobhanA11.p.practice;

import java.util.Scanner;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class Handler {
    Scanner sc = new Scanner(System.in);
    private byte choice;

    public void mainHandler(DataBase db) {
        System.out.println(db.getStartHeader());
        System.out.println(db.getWelcomeText());
        System.out.println();
        System.out.println(db.getMenuHeader());
        while (true) {
            System.out.println(db.getMenuText());
            System.out.println();
            choice = menuHandler(db);
            if (choice == 1) {
                analyzeHandler();
            } else if (choice == 2) {
                System.out.println();
                System.out.println(db.getHelpText());
                System.out.println(db.getAboutText());
                System.out.println();
            } else if (choice == 3) {
                System.out.println(db.getExitText());
                break;
            } else {
                System.out.println("\nSomething went wrong!");
            }
        }
    }

    public byte menuHandler(DataBase db) {
        byte tempChoice;
        while (true) {
            System.out.print(db.getChose());
            if (sc.hasNextDouble()) {
                tempChoice = sc.nextByte();
                if (tempChoice == 1 || tempChoice == 2 || tempChoice == 3) {
                    return tempChoice;
                } else {
                    System.out.println(db.getNumberErrorText());
                }
            } else {
                System.out.println(db.getNumberErrorText());
                sc.next();
            }
        }
    }

    public void analyzeHandler() {

    }

    public void resetChoice() {
        choice = 0;
    }
}
