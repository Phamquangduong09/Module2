package BTTL.Day7;

public class Bird extends Animal implements Winged {

    @Override
    public void fly() {
        System.out.println("chim đag bay");
    }

    @Override
    public void eat() {
        System.out.println("chim Đang ăn");
    }
}
