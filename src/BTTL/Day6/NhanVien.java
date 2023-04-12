package BTTL.Day6;

public class NhanVien {

    private  int id ;
    private static int idTemp = 1;
    private String name;
    private int age;

    public NhanVien() {
        idTemp++;
    }

    public NhanVien( String name, int age) {
        this.id = idTemp++ ;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

