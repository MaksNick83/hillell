package homework4;

public class Zoo {
    public static void main(String[] args) {
        int bearsCount, tigersCount, parrotsCount, elephantsCount, raccoonsCount;
        float bearsIncrease, tigersIncrease, parrotsIncrease, elephantsIncrease, raccoonsIncrease;
        //Початкові значення приросту в процентах
        bearsIncrease = 30;
        tigersIncrease = 20;
        parrotsIncrease = 40;
        elephantsIncrease = 5;
        raccoonsIncrease = 80;
        //Згенеруємо для кожного виду кількість звірів
        bearsCount = randomValue(2, 30);
        tigersCount = randomValue(2, 30);
        parrotsCount = randomValue(2, 30);
        elephantsCount = randomValue(2, 30);
        raccoonsCount = randomValue(2, 30);
        //згенеровані кількості звірів покажемо в консолі з відповідними процентами приросту
        System.out.println("Кількість ведмедів: " + bearsCount + ".Процент приросту " + bearsIncrease);
        System.out.println("Кількість тигрів: " + tigersCount + ".Процент приросту " + tigersIncrease);
        System.out.println("Кількість папуг: " + parrotsCount + ".Процент приросту " + parrotsIncrease);
        System.out.println("Кількість слонів: " + elephantsCount + ".Процент приросту " + elephantsIncrease);
        System.out.println("Кількість єнотів: " + raccoonsCount + ".Процент приросту " + raccoonsIncrease);
        System.out.println("***************************************************************************");
        //Загальна кількість звірів
        int allCount = countAnimals(bearsCount, tigersCount, parrotsCount, elephantsCount, raccoonsCount);
        System.out.println("Звірів в зоопарку цього року:" + allCount);
        //Скільки звірів буде за рік враховучи коефіцієнт приросту
        int yearCount = countAnimalsNextYear(bearsCount, bearsIncrease, tigersCount, tigersIncrease, parrotsCount, parrotsIncrease, elephantsCount, elephantsIncrease, raccoonsCount, raccoonsIncrease);
        System.out.println("Звірів через рік:" + yearCount);
        //Додаємо шостого звіра, дублюємо метод добавляємо параметри
        int porcupineCount = randomValue(2, 30);
        float porcupineIncrease = 15;
        System.out.println("Кількість дикобразів: " + porcupineCount + ".Процент приросту " + porcupineIncrease);
        int yearCountPorcupine = countAnimalsNextYear(bearsCount, bearsIncrease, tigersCount, tigersIncrease, parrotsCount, parrotsIncrease, elephantsCount, elephantsIncrease, raccoonsCount, raccoonsIncrease, porcupineCount, porcupineIncrease);
        System.out.println("Звірів за рік з урахуванням дикобраза:" + yearCountPorcupine);
    }

    /**
     * Вираховуєму кількість звірів в зоопарку через рік без дикобраза
     */
    private static int countAnimalsNextYear(int bearsCount, float bearsIncrease, int tigersCount, float tigersIncrease, int parrotsCount, float parrotsIncrease, int elephantsCount, float elephantsIncrease, int raccoonsCount, float raccoonsIncrease) {

        int bearsCountYear = increaseCountAnimalIncrease(bearsCount, bearsIncrease);
        int tigersCountYear = increaseCountAnimalIncrease(tigersCount, tigersIncrease);
        int parrotsCountYear = increaseCountAnimalIncrease(parrotsCount, parrotsIncrease);
        int elephantsCountYear = increaseCountAnimalIncrease(elephantsCount, elephantsIncrease);
        int raccoonsCountYear = increaseCountAnimalIncrease(raccoonsCount, raccoonsIncrease);

        return bearsCountYear + tigersCountYear + parrotsCountYear + elephantsCountYear + raccoonsCountYear;

    }

    /**
     * Вираховуєму кількість звірів в зоопарку через рік з дикобразом
     */
    private static int countAnimalsNextYear(int bearsCount, float bearsIncrease, int tigersCount, float tigersIncrease, int parrotsCount, float parrotsIncrease, int elephantsCount, float elephantsIncrease, int raccoonsCount, float raccoonsIncrease, int PorcupineCount, float PorcupineIncrease) {

        int bearsCountYear = increaseCountAnimalIncrease(bearsCount, bearsIncrease);
        int tigersCountYear = increaseCountAnimalIncrease(tigersCount, tigersIncrease);
        int parrotsCountYear = increaseCountAnimalIncrease(parrotsCount, parrotsIncrease);
        int elephantsCountYear = increaseCountAnimalIncrease(elephantsCount, elephantsIncrease);
        int raccoonsCountYear = increaseCountAnimalIncrease(raccoonsCount, raccoonsIncrease);
        int PorcupineCountYear = increaseCountAnimalIncrease(PorcupineCount, PorcupineIncrease);
        return bearsCountYear + tigersCountYear + parrotsCountYear + elephantsCountYear + raccoonsCountYear + PorcupineCountYear;

    }

    /**
     * Повертає загальну кількість з урахуванням приросту за рік,
     * результат округлюється до найближчого цілого
     *
     * @param typeCount    Кількість звірів
     * @param typeIncrease Процент приросту
     */
    private static int increaseCountAnimalIncrease(int typeCount, float typeIncrease) {
        //заокруглим до найближчого цілого, може бути більше але це ж природа
        return typeCount + Math.round(typeCount * (typeIncrease / 100));
    }

    /**
     * Повертає загальну кількість звірів.
     */
    private static int countAnimals(int bearsCount, int tigersCount, int parrotsCount, int elephantsCount, int raccoonsCount) {
        return bearsCount + tigersCount + parrotsCount + elephantsCount + raccoonsCount;
    }

    /**
     * Повертає випадкове ціле число в заданому діапазоні
     *
     * @param minCount Від
     * @param maxCount До
     */
    private static int randomValue(int minCount, int maxCount) {
        return minCount + (int) (Math.random() * ((maxCount - minCount) + 1));
    }


}
