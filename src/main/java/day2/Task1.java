package day2;

import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 9 ) {
            System.out.println("Многоэтажный дом");
        }
        if (num >= 5 && num < 9) {
            System.out.println("Среднеэтажный дом");
        }
        if (num >= 1 && num < 5) {
            System.out.println("Малоэтажный дом");
        }
        if (num < 1) {
            System.out.println("Ошибка ввода");
        }
    }
}
