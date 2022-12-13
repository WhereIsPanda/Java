import java.util.Scanner;

public class less3 {


    /**
     * 1. Напишите метод, который принимает на вход строку (String) и
     * определяет является ли строка палиндромом (возвращает boolean значение).
     * шалаш
     * abcdedcba
     * прова аворп
     * 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
     * и выведет в консоль результат вида
     * 1 Расширение файла: txt
     * 2 Расширение файла: pdf
     * 3 Расширение файла:
     * 4 Расширение файла: jpg
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palin = sc.nextLine();
        palindrom(palin);
        System.out.println(palindrom(palin));

    }

    public static boolean palindrom(String pal) {
        String result = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            result += pal.charAt(i);
        }
        if (result.equals(pal)) {
            return true;
        } else {
            return false;
        }

    }
}
