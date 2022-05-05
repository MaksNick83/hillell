package Homework4;

public class RecursionZoo {
    public static void main(String[] args) {

        int a = increaseCountAnimalIncrease(10, 30, 10);
        System.out.println("Кількість ведмедів через 10 років " + a);

    }

    private static int increaseCountAnimalIncrease(int typeCount, float typeIncrease, int countYear) {
        //Ціле значення, можна використати Math.Round()
        int typeCountYear = (int) (typeCount + (typeCount * (typeIncrease / 100)));
        if (countYear == 0) {//дійшли до кінця повертаємо загальну кількість за  задані роки
            return typeCount;
        }
        //визиваємо рекурсивно з збільшеним параметром кількості і зменшеним по рокам
        return increaseCountAnimalIncrease(typeCountYear, typeIncrease, countYear - 1);

    }
}

