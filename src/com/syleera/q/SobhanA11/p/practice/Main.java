package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/15/2026
 *
 * @author SobhanA11
 */

class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Main.printText(db.getName(), db.getLastName(), db.getNickName(), db.getCountry(), db.getCity(), db.getFavoriteCharacter(), db.getFavoriteGame(), db.getFavoriteLanguage(), db.getAge(), db.getHeaderText(), db.getFooterText());
    }

    public static void printText(String name, String lastName, String nickName, String country, String city, String favoriteCharacter, String favoriteGame, String favoriteLanguage, int age, String headerText, String footerText) {
        System.out.printf(
                "%s" +
                "\nname: %s" +
                "\nlast name: %s" +
                "\nnick name: %s" +
                "\ncountry: %s" +
                "\ncity: %s" +
                "\nfavorite character: %s" +
                "\nfavorite game: %s" +
                "\nfavorite language: %s" +
                "\nage: %s" +
                "\n%s"
                , headerText, name, lastName, nickName, country, city, favoriteCharacter, favoriteGame, favoriteLanguage, age, footerText);
    }
}