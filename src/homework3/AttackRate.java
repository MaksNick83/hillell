package homework3;

public class AttackRate {
    public static void main(String[] args) {
        //Задача 2. Розрахувати атаки
        //Армія династії Лі,показник атаки одного воїна
        int voinLi = 13;
        int luchLi = 24;
        int vershLi = 46;
        int kolLi = 860; // кількість войнів кожного типу
        //Армія династія Мінь,показник атаки одного воїна
        int voinMin = 9;
        int luchMin = 35;
        int vershMin = 12;
        int kolMin = (int) (kolLi * 1.5); // кількість войнів кожного типу ,більше в пітора рази
        //Розрахунок загального показника кожної армії
        int zagLi = kolLi * (voinLi + luchLi + vershLi);
        int zagMin = kolMin * (voinMin + luchMin + vershMin);
        System.out.println("Показник атаки династії Лі: = " + zagLi);
        System.out.println("Показник атаки династії Мінь: = " + zagMin);
    }
}
