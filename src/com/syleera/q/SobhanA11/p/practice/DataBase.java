package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class DataBase {
    private String equal = "====================";
    private String welcomeHeader = equal + "\n       Java Number Analyzer\n" + equal;
    private String welcomeText = "Hello and welcome to the Java Number Analyzer!";
    private String menuHeader = equal + "\n       MENU\n" + equal + "\n\n\"-1\": Analyze a set\n\"-3\": help\"-2\": Exit\n\nChoose: ";
    private String numCount = "How many numbers do you want to enter?";
    private String enterNumText = "Enter number %s: ";
    private String resultHeader = equal + "\n       RESULT\n" + equal;
    private String numberText = "Number %s: %s";
    private String statusText = "Status: %s";
    private String typeText = "Type: %s";
    private String status = "Status: %s";
    private String divisibleByThreeText = "Divisible by 3: %s";
    private String divisibleByFiveText = "Divisible bt 5: %s";
    private String sumText = "Sum: %s";
    private String averageText = "Average: %s";
    private String positivesText = "Positive numbers: %s";
    private String negativesText = "Negative numbers: %s";
    private String zerosText = "Zero numbers: %s";
    private String evensText = "Even numbers: %s";
    private String oddsText = "Odd numbers: %s";
    private String divisibleByThreesText = divisibleByThreeText;
    private String divisibleByFivesText = divisibleByFiveText;

    public String getTypeText() {
        return typeText;
    }

    public String getEqual() {
        return equal;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public String getNumCount() {
        return numCount;
    }

    public String getWelcomeHeader() {
        return welcomeHeader;
    }

    public String getMenuHeader() {
        return menuHeader;
    }

    public String getEnterNumText() {
        return enterNumText;
    }

    public String getResultHeader() {
        return resultHeader;
    }

    public String getNumberText() {
        return numberText;
    }

    public String getStatusText() {
        return statusText;
    }

    public String getStatus() {
        return status;
    }

    public String getDivisibleByThreeText() {
        return divisibleByThreeText;
    }

    public String getDivisibleByFiveText() {
        return divisibleByFiveText;
    }

    public String getSumText() {
        return sumText;
    }

    public String getPositivesText() {
        return positivesText;
    }

    public String getNegativesText() {
        return negativesText;
    }

    public String getDivisibleByFivesText() {
        return divisibleByFivesText;
    }

    public String getOddsText() {
        return oddsText;
    }

    public String getDivisibleByThreesText() {
        return divisibleByThreesText;
    }

    public String getEvensText() {
        return evensText;
    }

    public String getZerosText() {
        return zerosText;
    }

    public String getAverageText() {
        return averageText;
    }
}
