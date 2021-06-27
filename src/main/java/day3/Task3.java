package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {
//        Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
//        Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
//        Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
//        мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
//        Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 5;
            while (count>0) {
                String[] s = bufferedReader.readLine().split(" ");
                int num1 = Integer.parseInt(s[0]);
                int num2 = Integer.parseInt(s[1]);
                if (num2==0) {
                    System.out.println("Деление на 0");
                }
                else {
                    System.out.println((double)num1/(double)num2);
                }
                count--;
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
