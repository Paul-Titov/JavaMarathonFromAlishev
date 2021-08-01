package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Report1CShoesReader {

    public static List<Shoes> getShoesFrom1C() {
        List<Shoes> shoesResult = new ArrayList<>();
        File shoesFile = new File("src/main/resources/shoes.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(shoesFile));
            List<String> shoesList = reader.lines().collect(Collectors.toList());
            for (String s : shoesList) {
                String[] line = s.split(";");
                shoesResult.add(new Shoes(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return shoesResult;
    }
}
