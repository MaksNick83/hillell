package com.nikitchyn.homework13.task3;

public class Main {
    public static void main(String[] args) {
        //Створіть екземпляри кожного виду у мейн-класі та додайте їх в масив.
        //Для iPhones викличте метод додатково faceId(), а для Androids touchID()
        Smartphones smartponA = new Androids();
        Smartphones smartponeI = new IPhones();
        Smartphones[] smartphones = {smartponA, smartponeI};

        for (Smartphones smartphone : smartphones) {
            System.out.println("-------------" + smartphone.getName() + "---------------------");
            //Загальні методи
            smartphone.call();
            smartphone.sms();
            smartphone.internet();
            //Методи від належності до обєкту
            if (smartphone instanceof IOs) {
                IOs os = (IOs) smartphone;
                os.faceId();
            } else if (smartphone instanceof LinuxOs) {
                LinuxOs os = (LinuxOs) smartphone;
                os.touchID();
            }
        }
    }
}
