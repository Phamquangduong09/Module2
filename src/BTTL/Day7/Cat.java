package BTTL.Day7;

public class Cat extends Animal implements NotSwim {
    String color;
    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }



    @Override
    public void eat() {
        System.out.println("mèo Đang ăn");
    }

    @Override
    public void cannotswim() {
        System.out.println("Mèo k thể bơi");
    }
}
