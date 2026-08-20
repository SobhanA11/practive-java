package com.syleera.q.SobhanA11.p.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class Handler {
    private Scanner sc = new Scanner(System.in);
    private byte choice;
    private int numCount;
    private ArrayList<Double> nums = new ArrayList<>();

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
                analyzeHandler(db);
            } else if (choice == 2) {
                System.out.println();
                System.out.println(db.getHelpText());
                System.out.println(db.getAboutText());
                System.out.println();
            } else if (choice == 3) {
                System.out.println(db.getExitText());
                sc.close();
                break;
            } else {
                System.out.println(db.getSmwrng());
            }
        }
    }

    public byte menuHandler(DataBase db) {
        byte tempChoice;
        while (true) {
            System.out.print(db.getChose());
            if (sc.hasNextByte()) {
                tempChoice = sc.nextByte();
                if (tempChoice == 1 || tempChoice == 2 || tempChoice == 3) {
                    return tempChoice;
                } else {
                    System.out.println(db.getNumberError2Text());
                }
            } else {
                System.out.println(db.getNumberErrorText());
                sc.next();
            }
        }
    }

    public int numberCountHandler(DataBase db) {
        int tempNumCount;
        while (true) {
            System.out.print(db.getNumCount());
            if (sc.hasNextInt()) {
                tempNumCount = sc.nextByte();
                if (tempNumCount >= 1 && tempNumCount <= 1000000) {
                    return tempNumCount;
                } else {
                    System.out.println(db.getNumberError3Text());
                }
            } else {
                System.out.println(db.getNumberErrorText());
                sc.next();
            }
        }
    }

    public void analyzeHandler(DataBase db) {
        numCount = numberCountHandler(db);
        if (numCount >= 1 && numCount <= 1000000) {
            for (int i = 0; i < numCount; i++){
                System.out.printf( db.getEnterNumText(), (i + 1));
                nums.add(i, sc.nextDouble());
            }
        } else {
            System.out.println(db.getSmwrng());
        }
    }

    public void resetChoice() {
        choice = 0;
    }

    public void resetNumCount() {
        numCount = 0;
    }

    public void resetNumList() {
        nums.clear();
    }

    public void resetAll() {
        resetChoice();
        resetNumCount();
        resetNumList();
    }
}
