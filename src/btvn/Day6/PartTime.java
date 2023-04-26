package btvn.Day6;

public class PartTime extends NhanVien {
    private int workTime;

    public PartTime() {
    }

    public PartTime(int workTime) {
        this.workTime = workTime;
    }

    public PartTime( String name, int age, int workTime) {
        super( name, age);
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", workTime :" + workTime;


    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
