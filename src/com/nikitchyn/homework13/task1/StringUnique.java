package com.nikitchyn.homework13.task1;

public class StringUnique {
    public static void main(String[] args) {
        //  У метод main() додайте код для виклику методу uniqueChars() і передайте рядок: «Using methods of class String» як аргумент.
        String str = "Using methods of class String";
        //  Роздрукувати результат на консолі.
        System.out.println(uniqueChars(str));
    }

    //  Створіть статичний метод: uniqueChars(String s), який повинен прийняти String як аргумент
    //  і повернути масив окремих (унікальних) символів (char[]) заданого рядка.
    private static char[] uniqueChars(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (stringBuilder.indexOf(String.valueOf(charArray[i])) == -1) { //перевіряємо чи добавили цей символ в stringBuilder
                stringBuilder.append(charArray[i]);
            }
        }
        return stringBuilder.toString().toCharArray();
    }
}
