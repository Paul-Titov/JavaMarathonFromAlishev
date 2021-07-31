package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people")));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                if (Integer.parseInt(line[1]) < 0) {
//                    System.out.println("Некорректный входной файл");
                    throw new Exception("Некорректный входной файл");
                }
                people.add(line[0]+" "+line[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return people;
    }
}
