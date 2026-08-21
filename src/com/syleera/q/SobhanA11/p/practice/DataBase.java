package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/16/2026
 *
 * @author SobhanA11
 */

public class DataBase {
    private String equal = "====================";
    private String startHeader = equal + equal + "\n       Java Number Analyzer\n" + equal + equal;
    private String welcomeText = "Hello and welcome to the Java Number Analyzer!";
    private String menuHeader = equal + "\n       MENU\n" + equal;
    private String menuText = "1: Analyze a set\n2: help\n3: Exit";
    private String chose = "chose: ";
    private String numCount = "How many numbers do you want to enter? ";
    private String enterNumText = "Enter number %s: ";
    private String resultHeader = equal + "\n       RESULT\n" + equal;
    private String numberText = "Number %s: %s";
    private String statusText = "Status: %s";
    private String typeText = "Type: %s";
    private String divisibleByThreeText = "Divisible by 3: %s";
    private String divisibleByFiveText = "Divisible by 5: %s";
    private String sumText = "Sum: %s";
    private String averageText = "Average: %s";
    private String positivesText = "Positive numbers: %s";
    private String negativesText = "Negative numbers: %s";
    private String zerosText = "Zero numbers: %s";
    private String evensText = "Even numbers: %s";
    private String oddsText = "Odd numbers: %s";
    private String numberErrorText = "Please only enter valid numbers!";
    private String numberError2Text = "Please enter between 1 or 2 or 3!";
    private String numberError3Text = "Please enter lower than 1,000,000 numbers!";
    private String helpText = "This app is created for analyzing numbers";
    private String githubText = "GitHub repo: https://github.com/SobhanA11/practive-java";
    private String githubReleaseText = "This release on github: https://github.com/SobhanA11/practive-java/releases/tag/1.4.1";
    private String licenseText = "© 2026 SobhanA11 — Apache License 2.0";
    private String butLicenseText = "Note: If you really need this project, feel free to use it without worrying about the license terms. You have my permission! :)";
    private String aboutText = "Created with ❤\uFE0F by SobhanA11";
    private String exitText = "See you soon!";
    private String smwrng = "Something went wrong!";

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

    public String getStartHeader() {
        return startHeader;
    }

    public String getMenuHeader() {
        return menuHeader;
    }

    public String getMenuText() {
        return menuText;
    }

    public String getChose() {
        return chose;
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

    public String getOddsText() {
        return oddsText;
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

    public String getNumberErrorText() {
        return numberErrorText;
    }

    public String getNumberError2Text() {
        return numberError2Text;
    }

    public String getNumberError3Text() {
        return numberError3Text;
    }

    public String getHelpText() {
        return helpText;
    }

    public String getGithubText() {
        return githubText;
    }

    public String getGithubReleaseText() {
        return githubReleaseText;
    }

    public String getLicenseText() {
        return licenseText;
    }

    public String getButLicenseText() {
        return butLicenseText;
    }

    public String getAboutText() {
        return aboutText;
    }

    public String getExitText() {
        return exitText;
    }

    public String getSmwrng() {
        return smwrng;
    }
}
