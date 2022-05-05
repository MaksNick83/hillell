package Homework4;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Holmes ", "London", "2936729462568"));
    }

    private static String personInfo(String name, String city, String telephone) {

        return "Зателефонувати громадянину " + name + " з міста " + city + " можна за номером " + telephone + ".";

    }
}
