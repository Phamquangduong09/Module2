package BTTL;

public class FullTime extends NhanVien{
    private int yearsOfExp;

    public FullTime() {
    }

    public FullTime(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public FullTime(int id, String name, int age, int yearsOfExp) {
        super(id , name , age);
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return "FullTime{" + super.toString()+
                "yearsOfExp=" + yearsOfExp +
                '}';
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
