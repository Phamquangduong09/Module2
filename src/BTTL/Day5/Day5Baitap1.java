package BTTL.Day5;

public class Day5Baitap1 {
    String ten;
    int tuoi;
    int toan;
    int ly;
    int hoa;
    double avg;
    public Day5Baitap1() {
    }

    public Day5Baitap1(String ten, int tuoi, int toan, int ly, int hoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
    public double getAvg(){
        return (this.toan+this.ly+this.hoa )/3;
    }

    @Override
    public String toString() {
        return "Day5Baitap1{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                '}';
    }

}
