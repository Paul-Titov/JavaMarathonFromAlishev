package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("Q3");
        car.setYear(2010);

        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
