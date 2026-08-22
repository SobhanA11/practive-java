package com.syleera.q.SobhanA11.p.practice;

import java.util.ArrayList;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */
public class Analyzer {

    private String positive = "Positive";
    private String negative = "Negative";
    private String zero = "Zero";
    private String even = "Even";
    private String odd = "Odd";

    public String analyzeSign(double num) {
        if (num > 0) {
            return positive;
        } else if (num < 0) {
            return negative;
        } else {
            return zero;
        }
    }

    public String analyzeParity(double num) {
        if (num % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }

    public boolean analyzeIsDivisibleByThree(double num) {
        return (num % 3 == 0);
    }

    public boolean analyzeIsDivisibleByFive(double num) {
        return (num % 5 == 0);
    }

    public double analyzeSum(ArrayList<Double> nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public double analyzeAverage(ArrayList<Double> nums) {
        double average;

        average = (analyzeSum(nums) / nums.size());
        return average;
    }

}
