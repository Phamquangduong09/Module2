package btvn.Day6;

public class FullTime extends NhanVien {

    private int yearsOfExp;

    public FullTime() {
    }

    public FullTime(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public FullTime( String name, int age, int yearsOfExp) {
        super( name , age);
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return super.toString() + ", yearOfExp=" + yearsOfExp;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
