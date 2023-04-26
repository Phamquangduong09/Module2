package btvn.Day7;

public class Penguins extends Animal implements Wingless {
    @Override
    public void eat() {
        System.out.println("Cánh cụt đang ăn");
    }

    @Override
    public void notfly() {
        System.out.println("đang bơi");
    }

}
