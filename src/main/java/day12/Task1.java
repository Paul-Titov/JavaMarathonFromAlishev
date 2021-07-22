package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
//        Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
        List<String> list = new ArrayList<>();
        list.add("brand1");
        list.add("brand2");
        list.add("brand3");
        list.add("brand4");
        list.add("brand5");

        System.out.println(list);
        list.add(2, "brand2.1");
        list.remove(0);
        System.out.println(list);
    }
}
