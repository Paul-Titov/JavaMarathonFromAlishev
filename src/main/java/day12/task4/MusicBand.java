package day12.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand MusicBandFrom, MusicBand MusicBandTo) {
        MusicBandTo.members.addAll(MusicBandFrom.members);
        MusicBandFrom.members = new ArrayList<>();
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }
}
