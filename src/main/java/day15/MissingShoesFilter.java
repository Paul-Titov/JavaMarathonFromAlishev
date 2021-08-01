package day15;

import java.util.List;
import java.util.stream.Collectors;

public class MissingShoesFilter {
    public static List<Shoes> getMissingShoes(List<Shoes> shoes) {
        return shoes.stream().filter(shoe -> shoe.getCount()==0).collect(Collectors.toList());
    }
}
