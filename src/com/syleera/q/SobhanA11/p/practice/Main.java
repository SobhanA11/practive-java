package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/15/2026
 *
 * @author SobhanA11
 */

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Handler handler = new Handler();
        handler.start(db);
    }
}