package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class DataBase {
    private final String EQUAL = "====================";
    private final String START_HEADER = EQUAL + EQUAL + "\n       Java Number Analyzer\n" + EQUAL + EQUAL;
    private final String WELCOME_TEXT = "Hello and welcome to the Java Number Analyzer!";
    private final String MENU_HEADER = EQUAL + "\n       MENU\n" + EQUAL;
    private final String MENU_TEXT = "1: Analyze a set\n2: help\n3: Exit";
    private final String CHOSE = "chose: ";
    private final String NUM_COUNT = "How many numbers do you want to enter? ";
    private final String ENTER_NUM_TEXT = "Enter number %s: ";
    private final String RESULT_HEADER = EQUAL + "\n       RESULT\n" + EQUAL;
    private final String NUMBER_TEXT = "Number %s: %s";
    private final String STATUS_TEXT = "Status: %s";
    private final String TYPE_TEXT = "Type: %s";
    private final String DIVISIBLE_BY_THREE_TEXT = "Divisible by 3: %s";
    private final String DIVISIBLE_BY_FIVE_TEXT = "Divisible by 5: %s";
    private final String SUM_TEXT = "Sum: %s";
    private final String AVERAGE_TEXT = "Average: %s";
    private final String POSITIVES_TEXT = "Positive numbers: %s";
    private final String NEGATIVES_TEXT = "Negative numbers: %s";
    private final String ZEROS_TEXT = "Zero numbers: %s";
    private final String EVENS_TEXT = "Even numbers: %s";
    private final String ODDS_TEXT = "Odd numbers: %s";
    private final String NUMBER_ERROR_TEXT = "Please only enter valid numbers!";
    private final String NUMBER_ERROR_2_TEXT = "Please enter between 1 or 2 or 3!";
    private final String NUMBER_ERROR_3_TEXT = "Please enter lower than 1,000,000 numbers!";
    private final String HELP_TEXT = "This app is created for analyzing numbers";
    private final String GITHUB_TEXT = "GitHub repo: https://github.com/SobhanA11/practive-java";
    private final String LICENSE_TEXT = "© 2026 SobhanA11 — Apache License 2.0";
    private final String BUT_LICENSE_TEXT = "Note: If you really need this project, feel free to use it without worrying about the license terms. You have my permission! :)";
    private final String ABOUT_TEXT = "Created with ❤\uFE0F by SobhanA11";
    private final String EXIT_TEXT = "See you soon!";
    private final String SMWRNG = "Something went wrong!";

    public String getTYPE_TEXT() {
        return TYPE_TEXT;
    }

    public String getEQUAL() {
        return EQUAL;
    }

    public String getWELCOME_TEXT() {
        return WELCOME_TEXT;
    }

    public String getNUM_COUNT() {
        return NUM_COUNT;
    }

    public String getSTART_HEADER() {
        return START_HEADER;
    }

    public String getMENU_HEADER() {
        return MENU_HEADER;
    }

    public String getMENU_TEXT() {
        return MENU_TEXT;
    }

    public String getCHOSE() {
        return CHOSE;
    }

    public String getENTER_NUM_TEXT() {
        return ENTER_NUM_TEXT;
    }

    public String getRESULT_HEADER() {
        return RESULT_HEADER;
    }

    public String getNUMBER_TEXT() {
        return NUMBER_TEXT;
    }

    public String getSTATUS_TEXT() {
        return STATUS_TEXT;
    }

    public String getDIVISIBLE_BY_THREE_TEXT() {
        return DIVISIBLE_BY_THREE_TEXT;
    }

    public String getDIVISIBLE_BY_FIVE_TEXT() {
        return DIVISIBLE_BY_FIVE_TEXT;
    }

    public String getSUM_TEXT() {
        return SUM_TEXT;
    }

    public String getPOSITIVES_TEXT() {
        return POSITIVES_TEXT;
    }

    public String getNEGATIVES_TEXT() {
        return NEGATIVES_TEXT;
    }

    public String getODDS_TEXT() {
        return ODDS_TEXT;
    }

    public String getEVENS_TEXT() {
        return EVENS_TEXT;
    }

    public String getZEROS_TEXT() {
        return ZEROS_TEXT;
    }

    public String getAVERAGE_TEXT() {
        return AVERAGE_TEXT;
    }

    public String getNUMBER_ERROR_TEXT() {
        return NUMBER_ERROR_TEXT;
    }

    public String getNUMBER_ERROR_2_TEXT() {
        return NUMBER_ERROR_2_TEXT;
    }

    public String getNUMBER_ERROR_3_TEXT() {
        return NUMBER_ERROR_3_TEXT;
    }

    public String getHELP_TEXT() {
        return HELP_TEXT;
    }

    public String getGITHUB_TEXT() {
        return GITHUB_TEXT;
    }

    public String getLICENSE_TEXT() {
        return LICENSE_TEXT;
    }

    public String getBUT_LICENSE_TEXT() {
        return BUT_LICENSE_TEXT;
    }

    public String getABOUT_TEXT() {
        return ABOUT_TEXT;
    }

    public String getEXIT_TEXT() {
        return EXIT_TEXT;
    }

    public String getSMWRNG() {
        return SMWRNG;
    }
}
