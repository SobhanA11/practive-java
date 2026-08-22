package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/15/2026
 *
 * @author SobhanA11
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection connection =
                DriverManager.getConnection("jdbc:sqlite:database.db");

        System.out.println("SQLite connected!");

        connection.close();
    }
}