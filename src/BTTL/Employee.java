package BTTL;

public class Employee {
    int id;
    String name;
    int year;
    String gender;
    int experience;

    public Employee() {

    }

    public Employee(int id, String name, int year, String gender, int experience) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public static void show(Employee[]employees){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name +
                ", year=" + year +
                ", gender='" + gender +
                ", experience=" + experience +
                '}';
    }
}
