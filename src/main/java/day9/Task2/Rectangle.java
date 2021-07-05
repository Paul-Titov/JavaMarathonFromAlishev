package day9.Task2;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double weigth, String color) {
        super(color);
        this.height = height;
        this.width = weigth;
    }

    public double area() {
        return height*width;
    }

    public double perimeter() {
        return 2*(height+width);
    }
}
