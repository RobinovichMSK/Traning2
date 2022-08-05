package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {
        /*2. Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.

Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается
их среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет
находиться 50 вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.

Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.

Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2: 5.75 26.5 34.5
Ответ: 66

Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66.*/


        lunchProgram();
    }


    public static void lunchProgram() throws FileNotFoundException {
        createFile1();
        createFile2();
//        printResult();
    }

    public static void createFile1() throws FileNotFoundException {
        File file = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file);
        int i = 0;
        while (i < 1000) {
            i++;
            pw1.println((int) (Math.random() * 100) + 1);
        }
        pw1.close();
    }

    public static void createFile2() throws FileNotFoundException {
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        File file = new File("file1.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int j = 1; j <= 1001; j += 20) {

            for (double i = 1; i < 21; i++) {

                double number = Integer.parseInt(scanner.nextLine());
                list.add(number);
            }

            var sum = 0;
            for (double number : list) {
                sum += number;
            }
            double result = (double) sum / list.size();
            System.out.println(String.format("%.2f", result));

        }
//        list2.add(String.format("%.2f",result));
//        System.out.println(String.format("%.2f", (double) sum / list.size()));
//        System.out.println("-----------");
//        System.out.println(list2);
//        pw2.println(list);
//        pw2.close();
    }
}
//        public static void printResult(File file){

//        }


