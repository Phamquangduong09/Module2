package BTTL.Day7;

public class Dog extends Animal implements Swim {
    String color;

    public Dog() {
    }

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("chó Đamg ăn");
    }

    @Override
    public void Knowhowtoswim() {
        System.out.println("Chó đang bơi");
    }
}
