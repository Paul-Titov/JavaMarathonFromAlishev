package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            iLoop:
            while (true) {
                String city = bufferedReader.readLine();
                switch(city) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                    case "Stop":
                        break iLoop;
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
