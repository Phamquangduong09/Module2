package day28_4.democode;

public class Main {
    public static void main(String[] args) {
    ShapeManager manager = new ShapeManager(new Rectangle(5,10));
    ShapeManager manager1 = new ShapeManager(new Circle(5));
        System.out.println(manager.getArea());
        System.out.println(manager1.getArea());

}
}
