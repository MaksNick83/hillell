package Homework3;

public class AttackRate {
    public static void main(String[] args) {
        //Задача 2. Розрахувати атаки
        //Армія династії Лі,показник атаки одного воїна
        float voinLi = 13;
        float luchLi = 24;
        float vershLi = 46;
        float kolLi = 860; // кількість войнів кожного типу
        //Армія династія Мінь,показник атаки одного воїна
        float voinMin = 9;
        float luchMin = 35;
        float vershMin = 12;
        float kolMin = 1290; // кількість войнів кожного типу(860*1.5)
        //Розрахунок загального показника кожної армії
        float zagLi = kolLi * (voinLi+luchLi+vershLi);
        float zagMin = kolMin * (voinMin+luchMin+vershMin);
        System.out.printf("Показник атаки династії Лі: = %.4f \n", zagLi);
        System.out.printf("Показник атаки династії Мінь: = %.4f\n", zagMin);
    }
}
