package day8;

public class Task1 {
    public static void main(String[] args) {
//        1. Создать строку, состоящую из чисел от 0 до 20000.
//        Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”)
//        чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//
//        После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
//        0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//        Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder,
//                реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
        long startTime = System.currentTimeMillis();
        String stringNumbers = "";
        for (int i = 0; i <= 20000; i++) {
            stringNumbers = stringNumbers.concat(i+" ");
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("время работы для String.concat = "+(finishTime-startTime)+" ms");
        System.out.println(stringNumbers);

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("время работы для stringBuilder = "+(finishTime-startTime)+" ms");
        System.out.println(stringBuilder);
    }
}
