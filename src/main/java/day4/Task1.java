package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraysSize = scanner.nextInt();
        int[] randomIntArray = new int[arraysSize];
        Random random = new Random();
        int qountElemBiggerEight = 0;
        int qountElemIsOne = 0;
        int qountElemIsEven = 0;
        int qountElemIsOdd = 0;
        int sumAllElements = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt(11);
            if (randomIntArray[i] > 8) {
                qountElemBiggerEight++;
            }
            if (randomIntArray[i] == 1) {
                qountElemIsOne++;
            }
            if (randomIntArray[i]%2==0) {
                qountElemIsEven++;
            } else {
                qountElemIsOdd++;
            }
            sumAllElements+=randomIntArray[i];
        }
        System.out.println("Введено число "+arraysSize+". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(randomIntArray));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: "+randomIntArray.length);
        System.out.println("Количество чисел больше 8: "+qountElemBiggerEight);
        System.out.println("Количество чисел равных 1: "+qountElemIsOne);
        System.out.println("Количество четных чисел: "+qountElemIsEven);
        System.out.println("Количество нечетных чисел: "+qountElemIsOdd);
        System.out.println("Сумма всех элементов массива: "+qountElemIsOdd);
    }
}
