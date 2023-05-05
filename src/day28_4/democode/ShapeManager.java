package day28_4.democode;

public class ShapeManager {
 private Calculate calculate;
 private double kq ;

    public ShapeManager(Calculate calculate) {
        this.calculate = calculate;
        this.kq = this.calculate.getArea();
    }
    public double getArea(){
        return this.kq;
    }
}

