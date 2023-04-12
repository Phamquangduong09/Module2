package BTTL.Day8.BaiTap2;

public class Person {
    private int id ;
    private  static int idTemp = 1;
    private String name;
    private  int age;
    private Address address;

    public Person() {
        idTemp++;
    }

    public Person( String name, int age, Address address) {
        this.id = idTemp++;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " name='" + name +
                " age=" + age +
                " address=" + address;
    }
}
