package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
//        Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
//        Создать 10 или более экземпляров класса MusicBand , добавить их в список
//        (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
//        Перемешать список. Создать статический метод в классе Task3:
//        public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, о
//        снованных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
//        Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("band1", 1980));
        musicBands.add(new MusicBand("band2", 1985));
        musicBands.add(new MusicBand("band3", 1990));
        musicBands.add(new MusicBand("band4", 1995));
        musicBands.add(new MusicBand("band5", 2000));
        musicBands.add(new MusicBand("band6", 2005));
        musicBands.add(new MusicBand("band7", 2010));
        musicBands.add(new MusicBand("band8", 2015));
        musicBands.add(new MusicBand("band9", 2020));
        musicBands.add(new MusicBand("band10", 2025));
        Collections.shuffle(musicBands);
        musicBands.forEach((s) -> System.out.println(s.getYear()));

        List<MusicBand> filteredMusicBands = groupsAfter2000(musicBands);
        System.out.println("--------------------");
        filteredMusicBands.forEach((s) -> System.out.println(s.getYear()));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter((s) -> s.getYear()>2000).collect(Collectors.toList());
    }
}
