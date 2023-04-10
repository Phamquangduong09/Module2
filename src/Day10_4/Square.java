package Day10_4;

public class Square implements Resizeable {
    private double height;
    private String color;

    public Square() {
    }

    public Square(double height, String color) {
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void resize(double percent) {
        this.height= percent;
        this.color = "pink";
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
