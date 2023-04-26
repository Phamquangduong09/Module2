package day8_4;

public class Circle {
    int radius ;
    String color;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     static class  Cylinder extends Circle{
        double height ;

         public Cylinder() {
         }

         public Cylinder(int radius, String color, double height) {
             super(radius, color);
             this.height = height;
         }

         public double getHeight() {
             return height;
         }

         public void setHeight(double height) {
             this.height = height;
         }

         @Override
         public String toString() {
             return "Cylinder{" +
                     "height=" + height +
                     ", radius=" + radius +
                     ", color='" + color + '\'' +
                     '}';
         }
     }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
