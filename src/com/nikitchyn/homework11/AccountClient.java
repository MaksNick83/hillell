package com.nikitchyn.homework11;

public class AccountClient {
    //не змінівані
    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    private final String mail;
    private final String telephone;
    //змінювані
    private String surname;
    private int weight;
    private String pressure;
    private int countSteps;
    //Отсебятіна)) добавив це поле щоб відслідкувати тільки ті объєкти котрі змінили моїми сетерами
    //Хеш памятаю, можна було б піти через масиви, зберігати хеш до і після потім порівнювати
    private boolean isChanged;
    private static final int YEARTODAY = 2022; // константа

    public AccountClient(String name, int dayBirthday, int monthBirthday, int yearBirthday, String mail, String telephone, String surname, int weight, String pressure, int countSteps) {
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.mail = mail;
        this.telephone = telephone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.countSteps = countSteps;
        this.isChanged = true; //всі створені змінені
    }

    public int getAge() {
        return YEARTODAY - yearBirthday; //зміна age
    }

    public boolean isChanged() {
        return isChanged;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        this.isChanged = true;//змінений
    }

    public void setWeight(int weight) {
        this.weight = weight;
        this.isChanged = true;//змінений
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
        this.isChanged = true;//змінений
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
        this.isChanged = true;//змінений
    }

    public String printAccountInfo() {
        this.isChanged = false; //вивели, рахуємо що змінили
        return "AccountClient{" + "name='" + name + '\'' + ", dayBirthday=" + dayBirthday + ", monthBirthday=" + monthBirthday + ", yearBirthday=" + yearBirthday + ", age=" + getAge() + ", mail='" + mail + '\'' + ", telephone='" + telephone + '\'' + ", surname='" + surname + '\'' + ", weight='" + weight + '\'' + ", pressure='" + pressure + '\'' + ", countSteps='" + countSteps + '\'' + '}';

    }
}
