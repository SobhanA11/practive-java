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

    public void start(DataBase db, Analyzer alz) {
        System.out.println(db.getStartHeader());
        System.out.println(db.getWelcomeText());
        System.out.println();
        while (true) {
            System.out.println(db.getMenuHeader());
            System.out.println(db.getMenuText());
            System.out.println();
            choice = handleMenu(db);
            if (choice == 1) {
                handleNums(db);
                handleAnalyze(db, alz);
            } else if (choice == 2) {
                System.out.println();
                System.out.println(db.getHelpText());
                System.out.println(db.getGithubText());
                System.out.println(db.getGithubReleaseText());
                System.out.println(db.getAboutText());
                System.out.println(db.getLicenseText());
                System.out.println(db.getButLicenseText());
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

    public byte handleMenu(DataBase db) {
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

    public int handleNumberCount(DataBase db) {
        int tempNumCount;
        while (true) {
            System.out.print(db.getNumCount());
            if (sc.hasNextInt()) {
                tempNumCount = sc.nextInt();
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

    public void handleNums(DataBase db) {
        numCount = handleNumberCount(db);
        if (numCount >= 1 && numCount <= 1000000) {
            for (int i = 0; i < numCount; i++){
                nums.add(i, handleSingleNumber(db, i));
            }
        } else {
            System.out.println(db.getSmwrng());
        }
    }

    public double handleSingleNumber (DataBase db, int i) {
        double tempNum;
        while (true) {
            System.out.printf( db.getEnterNumText(), (i + 1));
            if (sc.hasNextDouble()) {
                tempNum = sc.nextDouble();
                return tempNum;
            } else {
                System.out.println(db.getNumberErrorText());
                sc.next();
            }
        }
    }

    public void handleAnalyze(DataBase db, Analyzer alz) {
        System.out.println();
        System.out.println(db.getResultHeader());
        for (int i = 0; i < nums.size(); i++) {
            handleAnalyzePerNumber(db, alz, nums.get(i), i);
            System.out.println();
        }
        System.out.println();
        handleAnalyzeAllNumbers(db, alz);
        System.out.println();
        resetAll();
        alz.resetAll();
    }

    public void handleAnalyzePerNumber(DataBase db, Analyzer alz, double num, int i) {
        System.out.printf(db.getNumberText(), (i + 1) , num);
        System.out.println();
        System.out.printf(db.getStatusText(), alz.analyzeSign(num));
        System.out.println();
        System.out.printf(db.getTypeText(), alz.analyzeParity(num));
        System.out.println();
        System.out.printf(db.getDivisibleByThreeText(), alz.analyzeIsDivisibleByThree(num));
        System.out.println();
        System.out.printf(db.getDivisibleByFiveText(), alz.analyzeIsDivisibleByFIve(num));
        System.out.println();
    }

    public void handleAnalyzeAllNumbers(DataBase db, Analyzer alz) {
        ArrayList<Double> positives = new ArrayList<>();
        String positivesText = "";
        ArrayList<Double> negatives = new ArrayList<>();
        String negativesText = "";
        ArrayList<Double> zeros = new ArrayList<>();
        String zerosText = "";
        ArrayList<Double> evens = new ArrayList<>();
        String evensText = "";
        ArrayList<Double> odds = new ArrayList<>();
        String oddsText = "";
        ArrayList<Double> divisibleByThrees = new ArrayList<>();
        String divisibleByThreesText = "";
        ArrayList<Double> divisibleByFives = new ArrayList<>();
        String divisibleByFivesText = "";

        System.out.printf(db.getSumText(), alz.analyzeSum(nums));
        System.out.println();

        System.out.printf(db.getAverageText(), alz.analyzeAverage(nums));
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if ( (alz.analyzeSign(nums.get(i))).equals("Positive") ) {
                positives.add(nums.get(i));
            } else if ( (alz.analyzeSign(nums.get(i))) .equals("Negative") ) {
                negatives.add(nums.get(i));
            } else {
                zeros.add(nums.get(i));
            }

            if ( (alz.analyzeParity(nums.get(i))).equals("Even") ) {
                evens.add(nums.get(i));
            } else {
                odds.add(nums.get(i));
            }

            if (alz.analyzeIsDivisibleByThree(nums.get(i))) {
                divisibleByThrees.add(nums.get(i));
            }

            if (alz.analyzeIsDivisibleByFIve(nums.get(i))) {
                divisibleByFives.add(nums.get(i));
            }
        }

        for (int i = 0; i < positives.size(); i++) {
            positivesText += positives.get(i);
            if (i != (positives.size() - 1)) {
                positivesText += ", ";
            }
        }
        System.out.printf(db.getPositivesText(), positivesText);
        System.out.println();

        for (int i = 0; i < negatives.size(); i++) {
            negativesText += negatives.get(i);
            if (i != (negatives.size() - 1)) {
                negativesText += ", ";
            }
        }
        System.out.printf(db.getNegativesText(), negativesText);
        System.out.println();

        for (int i = 0; i < zeros.size(); i++) {
            zerosText += zeros.get(i);
            if (i != (zeros.size() - 1)) {
                zerosText += ", ";
            }
        }
        System.out.printf(db.getZerosText(), zerosText);
        System.out.println();

        for (int i = 0; i < evens.size(); i++) {
            evensText += evens.get(i);
            if (i != (evens.size() - 1)) {
                evensText += ", ";
            }
        }
        System.out.printf(db.getEvensText(), evensText);
        System.out.println();

        for (int i = 0; i < odds.size(); i++) {
            oddsText += odds.get(i);
            if (i != (odds.size() - 1)) {
                oddsText += ", ";
            }
        }
        System.out.printf(db.getOddsText(), oddsText);
        System.out.println();

        for (int i = 0; i < divisibleByThrees.size(); i++) {
            divisibleByThreesText += divisibleByThrees.get(i);
            if (i != (divisibleByThrees.size() - 1)) {
                divisibleByThreesText += ", ";
            }
        }
        System.out.printf(db.getDivisibleByThreeText(), divisibleByThreesText);
        System.out.println();

        for (int i = 0; i < divisibleByFives.size(); i++) {
            divisibleByFivesText += divisibleByFives.get(i);
            if (i != (divisibleByFives.size() - 1)) {
                divisibleByFivesText += ", ";
            }
        }
        System.out.printf(db.getDivisibleByFiveText(), divisibleByFivesText);
        System.out.println();
    }

    public void resetChoice() {
        choice = 0;
    }

    public void resetNumCount() {
        numCount = 0;
    }

    public void resetNums() {
        nums.clear();
    }

    public void resetAll() {
        resetChoice();
        resetNumCount();
        resetNums();
    }
}
