package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people")));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                if (Integer.parseInt(line[1]) < 0) {
                    System.out.println("Некорректный входной файл");
                }
                people.add(new Person(line[0], Integer.parseInt(line[1])));

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return people;
    }
}
