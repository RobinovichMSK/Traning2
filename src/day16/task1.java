package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*1. Реализовать программу, которая на вход принимает txt файл с целыми числами
        (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит
        в консоль среднее арифметическое этих чисел.
        Ответ будет являться вещественным числом. В консоль необходимо вывести полную
        запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
        (с 3 знаками после запятой).

        Детали реализации: В классе Task1 создать публичный статический метод printResult(File file),
        в котором реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод
        printResult(File file), передав ему в качестве аргумента объект класса File (txt файл с целыми числами).
        Возникающие исключения обрабатывать внутри метода.

        Пример:
        Числа в txt файле: 5 2 8 34 1 36 77
        Ответ: 23.285714285714285 --> 23.286 */
public class task1 {
    public static void main(String[] args) {
        File file = new File("tekst1");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 7) {
                throw new IllegalAccessException("Неккоректный входной файл");
            }
            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }

            System.out.println(String.format("%.3f",(double) sum / numbersString.length ));
            System.out.println(new DecimalFormat( "##.###" ).format((double) sum / numbersString.length ));
            System.out.println((double) sum / numbersString.length);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
