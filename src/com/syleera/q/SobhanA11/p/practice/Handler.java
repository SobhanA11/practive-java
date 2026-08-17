package com.syleera.q.SobhanA11.p.practice;

import java.util.Scanner;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class Handler {
    Scanner sc = new Scanner(System.in);
    double tempChoice;

    public void runApp(DataBase db) {
        System.out.println(db.getStartHeader());
        System.out.println(db.getWelcomeText());
        System.out.println();
        System.out.println(db.getMenu());
        System.out.println();
        menuHandler(db);
    }

    public double menuHandler(DataBase db) {
        while (true) {
            System.out.print(db.getChose());
            if (sc.hasNextDouble()) {
                tempChoice = sc.nextDouble();
                if (tempChoice == 1 || tempChoice == 2 || tempChoice == 3) {
                    return tempChoice;
                } else {
                    System.out.println(db.getNumberError());
                }
            } else {
                System.out.println(db.getNumberError());
                sc.next();
            }
        }
    }
}
