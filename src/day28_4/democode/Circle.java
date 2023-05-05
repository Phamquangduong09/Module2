package day28_4.democode;

public class Circle implements Calculate {
    private double a ;
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return  (a*a)*PI;
    }

    @Override
    public double getPerimeter() {
        return (a*2)*PI;
    }

}
