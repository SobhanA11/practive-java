package com.syleera.q.SobhanA11.p.practice.actions;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */
public class Analyzer {
    private double sum;
    private int amount;
    private String positive = "Positive";
    private String negative = "Negative";
    private String zero = "zero";
    private String even = "Even";
    private String odd = "Odd";

    public String status(double num) {
        if (num > 0) {
            return positive;
        } else if (num < 0){
            return negative;
        } else {
            return zero;
        }
    }

    public String type(double num) {
        if (num % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }

    public void divisibleByThree() {

    }

    public void divisibleByFIve() {

    }

    public void addSum() {

    }

    public void getSum() {

    }

    public void resetSum() {

    }

    public void resetAmount() {

    }

    public void resetAll() {
        resetAmount();
        resetSum();
    }

    public void getAverageBySum() {

    }

    public void isPositive() {

    }

    public void isNegative() {

    }

    public void isZero() {

    }

    public void isEven() {

    }

    public void isOdd() {

    }
}
