package com.syleera.q.SobhanA11.p.practice;

/**
 * Created at 8/15/2026
 *
 * @author SobhanA11
 */

public class DataBase {
    private String name = "Sobhan";
    private String lastName = "Ahmadi";
    private String nickName = "SobhanA11";
    private String country = "Islamic Republic Of Iran";
    private String city = "Tehran";
    private String favoriteCharacter = "Sonic The Hedgehog";
    private String favoriteGame = "Minecraft: java edition";
    private String favoriteLanguage = "Java";
    private int age = 14;

    private String headerText = getBetweenText() + "\nJAVA PROFILE\n" + getBetweenText();
    private String betweenText = "====================";

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getFavoriteCharacter() {
        return favoriteCharacter;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public int getAge() {
        return age;
    }

    public String getHeaderText() {
        return headerText;
    }

    public String getBetweenText() {
        return betweenText;
    }
}
