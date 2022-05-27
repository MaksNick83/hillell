package com.nikitchyn.homework10;

//Зробити клас Burger
public class Burger {
    // який буде мати поля:
    // булочка, м'ясо, сир, зелень, майонез
    // поля зробимо типом int, буде вказуватися кількість інградієгтів
    private int bun;
    private int meat;
    private int cheese;
    private int herbs;
    private int mayonnaise;

    protected Burger() {// По змовченню не створюємо
   //     return;
    }

    //Зробити три конструктори, які дозволятимуть робити бургери трьох видів
    //1.звичайний бургер (усі компоненти),цей же конструктор використаю для подвійного мясного.
    //аж хочеться зробити один конструктор для всих бургерів,оперувати кількістью:)
    protected Burger(int bun, int meat, int cheese, int herbs, int mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;
        showBurger();
    }

    //2.бургер вегетаріанський (без майонезу)
    protected Burger(int bun, int meat, int cheese, int herbs) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        showBurger();
    }

    //Метод який генерує склад бургеру, добаляємо його в кожен конструктор, привадним для того щоб не доступний зовні
    private void showBurger() {
        String srtOut = ((bun > 0) ? " bun " : "") + ((meat > 0) ? " " + meat + " meat " : "") + ((cheese > 0) ? " cheese " : "") + (herbs > 0 ? " herbs " : "") + (mayonnaise > 0 ? " mayonnaise " : "");
        System.out.print(srtOut);
    }

    //Повертає Имя бургеру
    public String getName() {
        return " Звичайний ";
    }
}
