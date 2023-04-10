package Day10_4;

public class Rectangle implements Resizeable{
    private double height;
    private double width;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void resize(double percent) {
        this.height=percent;
        this.width = percent;
        this.color = "black";

    }
}
