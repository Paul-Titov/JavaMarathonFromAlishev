package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String[] s = bufferedReader.readLine().split(" ");
                double num1 = Double.parseDouble(s[0]);
                double num2 = Double.parseDouble(s[1]);
                if (num2 == 0) {
                    break;
                }
                System.out.println(num1/num2);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
