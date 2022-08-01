package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static List<Person> parseFileToObjList() {
        File file = new File("people");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String peoplelines = scanner.nextLine();

                String[] person = peoplelines.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);
            }
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }

}
