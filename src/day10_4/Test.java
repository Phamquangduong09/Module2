package day10_4;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("black",10);
        Rectangle rectangle = new Rectangle(30,10,"Black");
        Square square =new Square(30, "black");
        HinhHoc[] hinhHocs = {circle, rectangle,square};
        for (int i = 0; i < hinhHocs.length; i++) {
            System.out.println("Kích thước trước khi tăng:" + hinhHocs[i].getArea());
            hinhHocs[i].resize(10);
        }

    }
}
