package homework2;

public class Parallelepiped {
    //Створити у новому класі main-метод;
    public static void main(String[] args) {
        //Створити три змінні для зберігання сторін паралелепіпеда;
        float a,b,c;
        a = 19.35F;
        b = 15.34F;
        c = 17.38F;
        //Розрахувати об’єм у змінній volume;
        float volume =a*b*c;
        //Вивести на екран змінну volume у вигляді: System.out.println("Об’єм паралелепіпеда = "+ volume);
        System.out.println("Об’єм паралелепіпеда = "+ volume);
        //Порахувати сумарну довжину всіх сторін у змінній length та вивести її в консоль;
        float length = 4*(a+b+c);
        System.out.printf("Суммарна довжина = %.2f\n\n",length);
        //Створити дві змінні з широтою і довготою вашого поточного розташування або розташування будь-якої пам'ятки у світі; Вивести в консоль;
        //Географічний центр Європы 	47° 57′ 0″ N, 24° 11′ 0″ E
        String latitude ="47° 57′ 0″ N";
        String longitude="24° 11′ 0″ E";
        System.out.println("Географічний центр Європи:");
        System.out.println("Широта :"+latitude);
        System.out.println("Довгота:"+longitude);
    }

}
