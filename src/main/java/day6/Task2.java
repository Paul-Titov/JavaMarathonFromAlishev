package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 1990, 100, 100);
        airplane.setYear(1995);
        airplane.fillUp(5);
        airplane.fillUp(7);
        airplane.info();
    }
}
