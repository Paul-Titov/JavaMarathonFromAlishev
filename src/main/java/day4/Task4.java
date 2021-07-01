package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
//
//        Пример:
//*Для простоты пример показан на массиве размера 10
//
//                [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
//        Тройка с максимальной суммой: [8742, 1040, 3254]
//
//        Вывод в консоль:
//        13036
//        7
//
//                *Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки, то есть индекс числа 8742.
        int[] randomIntArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt(10001);
        }
        int index = 0;
        int maxSum = 0;
        int currentSum = 0;
        int[] currentTripleArray = new int[3];

        for (int i = 0; i < randomIntArray.length; i++) {
            if (i > 2) {
                currentTripleArray[0] = currentTripleArray[1];
                currentTripleArray[1] = currentTripleArray[2];
                currentTripleArray[2] = randomIntArray[i];

                currentSum = currentTripleArray[0]+currentTripleArray[1]+currentTripleArray[2];
                if (currentSum >= maxSum) {
                    maxSum = currentSum;
                    index = i-2;
                }
            }
        }
        System.out.println("Максимальная сумма трех элементов = "+maxSum);
        System.out.println("Индекс первого из трех элементов = "+index);
    }
}
