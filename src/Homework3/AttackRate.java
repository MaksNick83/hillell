package Homework3;

public class AttackRate {
    public static void main(String[] args) {
        //Задача 2. Розрахувати атаки
        //Армія династії Лі
        int voinLi = 13;
        int luchLi = 24;
        int vershLi = 46;
        int kolLi = 860; // кількість войнів кожного типу
        //Армія династія Мінь
        int voinMin = 9;
        int luchMin = 35;
        int vershMin = 12;
        int kolMin = 1290; // кількість войнів кожного типу(860*1.5)
        float zag_Li = (float) kolLi / (voinLi + luchLi + vershLi);
        float zag_Min = (float) kolMin / (voinMin + luchMin + vershMin);
        System.out.printf("Показник атаки династії Лі: = %.4f \n", zag_Li);
        System.out.printf("Показник атаки династії Мінь: = %.4f\n", zag_Min);
    }
}
