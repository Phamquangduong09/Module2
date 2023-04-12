package Day10_4;

public class Square extends HinhHoc implements Resizeable {
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
    public double getArea(){
        return height*height;
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea()*percent);
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
