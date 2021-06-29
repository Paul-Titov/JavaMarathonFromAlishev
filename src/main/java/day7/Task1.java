package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane firstAirplane = new Airplane("Boing", 1990, 101, 100);
        Airplane secondAirplane = new Airplane("Boing", 1990, 101, 100);
        Airplane.compareAirplanes(firstAirplane, secondAirplane);
    }
}