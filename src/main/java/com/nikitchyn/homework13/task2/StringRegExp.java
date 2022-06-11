package com.nikitchyn.homework13.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExp {
    public static void main(String[] args) {
        //    У методі main () оголосити масив String з наступними значеннями:
        //    {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
        String[] aryString = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String userNameString : aryString) {
            System.out.println(userNameString + " is " + checkPersonWithRegExp(userNameString));
        }
    }

    // Створіть відкритий статичний метод checkPersonWithRegExp(String userNameString), який приймає String як аргумент і повертає логічне значення.
    // Цей метод повинен повертати true, лише якщо значення рядка аргументів починається з верхнього регістру, а інші символи — у нижньому регістрі та містить лише літери.
    public static boolean checkPersonWithRegExp(String userNameString) {
        String regexp = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.find();
    }

}
