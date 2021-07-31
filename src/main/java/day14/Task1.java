package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("file"));
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            int count = 0;
            String[] nums = scanner.nextLine().split(" ");
            if (nums.length != 10) {
                throw new Exception("Некорректный входной файл");
            }
            for (String i : nums) {
                count++;
                sum += Integer.parseInt(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sum);
    }
}
