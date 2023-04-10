package Day10_4;

public class HinhTron {
    private double radius;
    private  String color;

    public HinhTron() {
    }

    public HinhTron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Ares (){
        return  this.radius * this.radius;
    }
}
