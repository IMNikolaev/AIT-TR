package lesson_22.figs;

public class Triangle extends Shape{
    private double length;
    private double altitude;

    public Triangle(double length, double altitude) {
        this.length = length;
        this.altitude = altitude;
    }

    @Override
    public double calculateArea() {
        return 0.5*(length * altitude);
    }
}
