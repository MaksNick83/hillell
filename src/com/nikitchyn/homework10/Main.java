package com.nikitchyn.homework10;

public class Main {
    public static void main(String[] args) {
        //Зробити клас BurgerHouse,в якому створити три різні бургери.
        //Їхній склад буде автоматично виводитися на екран під час запуску програми
        //Так як в конструкторі виводиться склад бургера, то но будемо використовувати
        // цикл для перегруженого метода getName
        BurgerHouse burgerHouse = new BurgerHouse();
        Burger universalBurger = burgerHouse.createUniversal();
        System.out.print(" - " + universalBurger.getName() + "\n");
        Burger vegBurger = burgerHouse.createVeg();
        System.out.print(" - " + vegBurger.getName() + "\n");
        Burger meetBurger = burgerHouse.createMeet();
        System.out.print(" - " + meetBurger.getName() + "\n");
    }
}
