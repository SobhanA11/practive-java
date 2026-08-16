package com.syleera.q.SobhanA11.p.practice;

import com.syleera.q.SobhanA11.p.practice.actions.*;

/**
 * Created at 8/15/2026
 *
 * @author SobhanA11
 */

public class Main {
    Jame jame = new Jame();
    Tafrig tafrig = new Tafrig();
    Zarb zarb = new Zarb();
    Tagsim tagsim = new Tagsim();
    Miangin miangin = new Miangin();

    public static void main(String[] ags) {
        Main main = new Main();
        main.resultPrinter(DataBase.getFirstNumber(), DataBase.getSecondNumber());
    }

    public void resultPrinter(int firstNumber, int secondNumber) {
        System.out.printf("Number 1: %s\nNumber 2: %s", firstNumber, secondNumber);
        System.out.println("\n");
        System.out.printf(
                "Addition: %s\n" +
                        "Subtraction: %s\n" +
                        "Multiplication: %s\n" +
                        "Division: %s\n" +
                        "Average: %S",
                jame.doJame(firstNumber, secondNumber),
                tafrig.doTafrig(firstNumber, secondNumber),
                zarb.doZarb(firstNumber, secondNumber),
                tagsim.doTagsim(firstNumber, secondNumber),
                miangin.doMiangin(firstNumber, secondNumber));
    }
}