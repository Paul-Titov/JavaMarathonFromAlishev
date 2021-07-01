package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] randomIntArray = new int[100];
        Random random = new Random();
        int maxElem = 0;
        int minElem = 0;
        int qountElemWithZero = 0;
        int sumElemWithZero = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt(10001);
        }
        for (int i : randomIntArray) {
            if (i > maxElem) {
                maxElem = i;
            }
            if (i < minElem) {
                minElem = i;
            }
            if (i%10==0) {
                qountElemWithZero++;
                sumElemWithZero+=i;
            }
        }
        System.out.println("Наимбольшее число в массиве: "+maxElem);
        System.out.println("Наименьшее число в массиве: "+minElem);
        System.out.println("Количество элементов заканчивающихся на 0: "+qountElemWithZero);
        System.out.println("Сумма элементов заканчивающихся на 0: "+sumElemWithZero);
    }
}
