package com.syleera.q.SobhanA11.p.practice.actions;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */
public class Miangin {
    Jame jame = new Jame();
    public double doMiangin(int firstNumber, int secondNumber) {
        double mianginResult = jame.doJame(firstNumber, secondNumber) / 2;
        return mianginResult;
    }
}
