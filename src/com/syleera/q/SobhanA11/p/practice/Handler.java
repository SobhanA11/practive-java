package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class Handler {
    public void runApp(DataBase db) {
        System.out.println(db.getStartHeader());
        System.out.println(db.getWelcomeText());
        System.out.println();
        System.out.println(db.getMenu());
    }
}
