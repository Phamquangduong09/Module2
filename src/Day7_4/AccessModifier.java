package Day7_4;

public class AccessModifier {
    public static void main(String[] args) {
        AccessModifier test = new AccessModifier(12, "blue");
        System.out.println(test.getAres());
        System.out.println(test.getColor());
    }

    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {

    }

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getAres() {
        return (radius * radius) * 3.14;
    }

    public String getColor() {
        return color;
    }
}

