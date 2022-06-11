package com.nikitchyn.homework13.task3;

public class IPhones implements Smartphones, IOs {
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
        return "Телефон на базі Linux";
    }

    @Override
    public void faceId() {
        System.out.println("Фейс ИД");
    }
}
