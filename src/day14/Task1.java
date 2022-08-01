package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("tekst1");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                throw new IllegalAccessException("Неккоректный входной файл");
            }
            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}

