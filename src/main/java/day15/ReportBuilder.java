package day15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class ReportBuilder {
    static void saveMissingShoes(List<Shoes> missingShoes) {
        String delimeter = ", ";
        Iterable<String> iterable = missingShoes.stream().map((Shoes shoes) -> shoes.getName()+delimeter+shoes.getSize()+delimeter+shoes.getCount()).collect(Collectors.toList());
        try {
            Files.write(new File("src/main/resources/missing_shoes.txt").toPath(), iterable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
