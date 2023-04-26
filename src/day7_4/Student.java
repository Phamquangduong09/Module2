package day7_4;

public class Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("duong");
        student.setClasse("C03");
        System.out.println(student.getName());
        System.out.println(student.getClasse());
    }

    private String name = "John";
    private String classe = "C02";

    public Student() {

    }

    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
