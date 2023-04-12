package Day10_4;

public class Circle extends HinhHoc implements Resizeable{
    private String color ;
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return (radius*radius ) * 3.14;
    }


    @Override
    public void resize(double percent) {
        System.out.println(getArea()*percent);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
