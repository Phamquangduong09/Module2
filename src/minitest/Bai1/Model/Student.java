package minitest.Bai1.Model;

public class Student extends People {
    private int id;
    private static int idUp = 1;
    public double avg;

    public Student() {
    }

    public Student(String name, int age, double avg) {
        super(name, age);
        this.id = idUp++;
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "id :" + super.toString() +
                ", point : " + avg
                ;
    }

}
