package com.syleera.q.SobhanA11.p.practice;

import java.util.ArrayList;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */
public class Analyzer {
    private double sum;
    private double average;
    private String error = "Error";
    private String positive = "Positive";
    private String negative = "Negative";
    private String zero = "zero";
    private String even = "Even";
    private String odd = "Odd";
    private boolean trueV = true;
    private boolean falseV = false;

    public String checkSign(double num) {
        if (num > 0) {
            return positive;
        } else if (num < 0) {
            return negative;
        } else{
            return zero;
        }
    }

    public String checkParity(double num) {
        if (num % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }

    public boolean isDivisibleByThree(double num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisibleByFIve(double num) {
        if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateSum(ArrayList<Double> nums) {
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public void resetSum() {
        sum = 0;
    }


    public double calculateAverage(ArrayList<Double> nums) {
        average = (calculateSum(nums) / nums.size());
        return average;
    }

    public double calculateAverage(ArrayList<Double> nums, double sum) {
        average = (sum / nums.size());
        return average;
    }

    public void resetAverage() {
        average = 0;
    }

    public void resetAll() {
        resetSum();
        resetAverage();
    }

}
