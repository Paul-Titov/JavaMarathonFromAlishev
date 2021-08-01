package day15;

import java.io.FileNotFoundException;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Shoes> shoes = Report1CShoesReader.getShoesFrom1C();
        List<Shoes> missingShoes = MissingShoesFilter.getMissingShoes(shoes);
        ReportBuilder.saveMissingShoes(missingShoes);
    }
}
