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
        System.out.println(db.getSTART_HEADER());
        System.out.println(db.getWELCOME_TEXT());
        System.out.println();
        while (true) {
            System.out.println(db.getMENU_HEADER());
            System.out.println(db.getMENU_TEXT());
            System.out.println();
            choice = handleMenu(db);
            if (choice == 1) {
                handleNums(db);
                handleAnalyze(db, alz);
            } else if (choice == 2) {
                System.out.println();
                System.out.println(db.getHELP_TEXT());
                System.out.println(db.getGITHUB_TEXT());
                System.out.println(db.getABOUT_TEXT());
                System.out.println(db.getLICENSE_TEXT());
                System.out.println(db.getBUT_LICENSE_TEXT());
                System.out.println();
            } else if (choice == 3) {
                System.out.println(db.getEXIT_TEXT());
                sc.close();
                break;
            } else {
                System.out.println(db.getSMWRNG());
            }
        }
    }

    public byte handleMenu(DataBase db) {
        byte tempChoice;
        while (true) {
            System.out.print(db.getCHOSE());
            if (sc.hasNextByte()) {
                tempChoice = sc.nextByte();
                if (tempChoice == 1 || tempChoice == 2 || tempChoice == 3) {
                    return tempChoice;
                } else {
                    System.out.println(db.getNUMBER_ERROR_2_TEXT());
                }
            } else {
                System.out.println(db.getNUMBER_ERROR_TEXT());
                sc.next();
            }
        }
    }

    public int handleNumberCount(DataBase db) {
        int tempNumCount;
        while (true) {
            System.out.print(db.getNUM_COUNT());
            if (sc.hasNextInt()) {
                tempNumCount = sc.nextInt();
                if (tempNumCount >= 1 && tempNumCount <= 1000000) {
                    return tempNumCount;
                } else {
                    System.out.println(db.getNUMBER_ERROR_3_TEXT());
                }
            } else {
                System.out.println(db.getNUMBER_ERROR_TEXT());
                sc.next();
            }
        }
    }

    public void handleNums(DataBase db) {
        numCount = handleNumberCount(db);
        for (int i = 0; i < numCount; i++) {
            nums.add(i, handleSingleNumber(db, i));
        }
    }

    public double handleSingleNumber(DataBase db, int i) {
        double tempNum;
        while (true) {
            System.out.printf(db.getENTER_NUM_TEXT(), (i + 1));
            if (sc.hasNextDouble()) {
                tempNum = sc.nextDouble();
                return tempNum;
            } else {
                System.out.println(db.getNUMBER_ERROR_TEXT());
                sc.next();
            }
        }
    }

    public void handleAnalyze(DataBase db, Analyzer alz) {
        System.out.println();
        System.out.println(db.getRESULT_HEADER());
        for (int i = 0; i < nums.size(); i++) {
            handleAnalyzePerNumber(db, alz, nums.get(i), i);
            System.out.println();
        }
        System.out.println();
        handleAnalyzeAllNumbers(db, alz);
        System.out.println();
        resetAll();
    }

    public void handleAnalyzePerNumber(DataBase db, Analyzer alz, double num, int i) {
        System.out.printf(db.getNUMBER_TEXT(), (i + 1), num);
        System.out.println();
        System.out.printf(db.getSTATUS_TEXT(), alz.analyzeSign(num));
        System.out.println();
        System.out.printf(db.getTYPE_TEXT(), alz.analyzeParity(num));
        System.out.println();
        System.out.printf(db.getDIVISIBLE_BY_THREE_TEXT(), alz.analyzeIsDivisibleByThree(num));
        System.out.println();
        System.out.printf(db.getDIVISIBLE_BY_FIVE_TEXT(), alz.analyzeIsDivisibleByFive(num));
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

        System.out.printf(db.getSUM_TEXT(), alz.analyzeSum(nums));
        System.out.println();

        System.out.printf(db.getAVERAGE_TEXT(), alz.analyzeAverage(nums));
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if ((alz.analyzeSign(nums.get(i))).equals("Positive")) {
                positives.add(nums.get(i));
            } else if ((alz.analyzeSign(nums.get(i))).equals("Negative")) {
                negatives.add(nums.get(i));
            } else {
                zeros.add(nums.get(i));
            }

            if ((alz.analyzeParity(nums.get(i))).equals("Even")) {
                evens.add(nums.get(i));
            } else {
                odds.add(nums.get(i));
            }

            if (alz.analyzeIsDivisibleByThree(nums.get(i))) {
                divisibleByThrees.add(nums.get(i));
            }

            if (alz.analyzeIsDivisibleByFive(nums.get(i))) {
                divisibleByFives.add(nums.get(i));
            }
        }

        for (int i = 0; i < positives.size(); i++) {
            positivesText += positives.get(i);
            if (i != (positives.size() - 1)) {
                positivesText += ", ";
            }
        }
        System.out.printf(db.getPOSITIVES_TEXT(), positivesText);
        System.out.println();

        for (int i = 0; i < negatives.size(); i++) {
            negativesText += negatives.get(i);
            if (i != (negatives.size() - 1)) {
                negativesText += ", ";
            }
        }
        System.out.printf(db.getNEGATIVES_TEXT(), negativesText);
        System.out.println();

        for (int i = 0; i < zeros.size(); i++) {
            zerosText += zeros.get(i);
            if (i != (zeros.size() - 1)) {
                zerosText += ", ";
            }
        }
        System.out.printf(db.getZEROS_TEXT(), zerosText);
        System.out.println();

        for (int i = 0; i < evens.size(); i++) {
            evensText += evens.get(i);
            if (i != (evens.size() - 1)) {
                evensText += ", ";
            }
        }
        System.out.printf(db.getEVENS_TEXT(), evensText);
        System.out.println();

        for (int i = 0; i < odds.size(); i++) {
            oddsText += odds.get(i);
            if (i != (odds.size() - 1)) {
                oddsText += ", ";
            }
        }
        System.out.printf(db.getODDS_TEXT(), oddsText);
        System.out.println();

        for (int i = 0; i < divisibleByThrees.size(); i++) {
            divisibleByThreesText += divisibleByThrees.get(i);
            if (i != (divisibleByThrees.size() - 1)) {
                divisibleByThreesText += ", ";
            }
        }
        System.out.printf(db.getDIVISIBLE_BY_THREE_TEXT(), divisibleByThreesText);
        System.out.println();

        for (int i = 0; i < divisibleByFives.size(); i++) {
            divisibleByFivesText += divisibleByFives.get(i);
            if (i != (divisibleByFives.size() - 1)) {
                divisibleByFivesText += ", ";
            }
        }
        System.out.printf(db.getDIVISIBLE_BY_FIVE_TEXT(), divisibleByFivesText);
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
