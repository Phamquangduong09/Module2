package Minitest.Bai2.model;

import Minitest.Bai2.model.ClassRoom;

public class Student {
    private int id ;
    private static int idUp=1;
    private String name ;
    private int age;
    private String gender;
    private double avgPoint;
    private ClassRoom classRoom;

    public Student() {
    }

    public Student(String name, int age, String gender, double avgPoint,ClassRoom classRoom) {
        this.id = idUp++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classRoom=classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return   id + ","+ name + "," + age + "," + gender + "," + avgPoint + "," + classRoom;
    }
}
