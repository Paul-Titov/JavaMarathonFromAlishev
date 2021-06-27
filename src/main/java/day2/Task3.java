package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (secondNum<firstNum) {
            System.out.println("Некорректный ввод");
        }
        int i = firstNum+1;
        while (i < secondNum) {
            if (i%5==0 && !(i%10==0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
