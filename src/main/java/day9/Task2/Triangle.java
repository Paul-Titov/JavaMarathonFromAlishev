package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle (int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s=(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
        return Math.sqrt(s);
    }



    public double perimeter() {
        return a+b+c;
    }


}
