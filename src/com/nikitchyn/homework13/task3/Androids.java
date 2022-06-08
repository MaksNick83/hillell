package com.nikitchyn.homework13.task3;

public class Androids implements Smartphones, LinuxOs {
    @Override
    public void call() {
        System.out.println("Дзвінок");
    }

    @Override
    public void sms() {
        System.out.println("CМС");
    }

    @Override
    public void internet() {
        System.out.println("Інтернет");
    }

    @Override
    public String getName() {
        return "Телефон на базі Андроїд";
    }

    @Override
    public void touchID() {
        System.out.println("Тач ІД");
    }
}
