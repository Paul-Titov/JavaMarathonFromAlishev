package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (secondNum<firstNum) {
            System.out.println("Некорректный ввод");
        }
        for (int i = firstNum+1; i < secondNum; i++) {
            if (i%5==0 && (i%10!=0)) {
                System.out.print(i + " ");
            }
        }
    }
}
