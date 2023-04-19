package Minitest.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage implements Manager<Student> {
    ArrayList<Student> arrayList = new ArrayList<>();
    ClassroomManage classroomManage = new ClassroomManage();

    @Override
    public ArrayList<Student> addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
        System.out.println("Enter Age ");
        int age = Integer.parseInt(scanner.nextLine());
        String gender = chooseGender();
        System.out.println("Enter point");
        double point = Double.parseDouble(scanner.nextLine());
        classroomManage.displayClassroom();
        System.out.println("Enter Class");
        ClassRoom classes = classroomManage.chooseClassroom();
        Student student = new Student(name, age, gender, point, classes);
        arrayList.add(student);
        return arrayList;
    }

    @Override
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id update");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (Student list : arrayList) {
            if (idUpdate == list.getId()) {
                System.out.println("Enter Name ");
                String name = scanner.nextLine();
                list.setName(name);
                System.out.println("Enter Age ");
                int age = Integer.parseInt(scanner.nextLine());
                list.getAge(age);
                String gender = chooseGender();
                list.setGender(gender);
                System.out.println("Enter point");
                double point = Double.parseDouble(scanner.nextLine());
                list.setAvgPoint(point);
                classroomManage.displayClassroom();
                System.out.println("Enter Class");
                ClassRoom classes = classroomManage.chooseClassroom();
                list.setClassRoom(classes);
            }
        }
        displayStudent();
    }

    @Override
    public Student deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        Student student = getIdStudent(idDelete);
        if (student != null) {
            arrayList.remove(student);
            return student;
        } else {
            return null;
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name search");
        String nameSearch = scanner.nextLine();
        boolean flag = false;
        for (Student student : arrayList) {
            if (student.getName().equalsIgnoreCase(nameSearch)) {
                System.out.println(student);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No information");
        }
    }

    @Override
    public void displayStudent() {
        for (Student list : arrayList) {
            System.out.println(list);
        }
    }

    public String chooseGender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your gender");
        System.out.println("1. Female");
        System.out.println("2. Male");
        System.out.println("3. Other");
        String gender = null;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                gender = "Female";
                break;
            case 2:
                gender = "Male";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public void displayStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to find");
        int idToFind = Integer.parseInt(sc.nextLine());
        if (getIdStudent(idToFind) != null) {
            System.out.println(getIdStudent(idToFind));
        } else {
            System.out.println("No information");
        }

    }

    public void displayStudentByClass() {
        System.out.println("1.");
    }

    public void displayHighestPoint() {
        double max = arrayList.get(0).getAvgPoint();
        for (Student student : arrayList) {
            if (max < student.getAvgPoint()) {
                max = student.getAvgPoint();
            }
        }
        System.out.println("Highest point :" + max);
    }

    public void displayLowestScore() {
        double min = arrayList.get(0).getAvgPoint();
        for (Student student : arrayList) {
            if (min > student.getAvgPoint()) {
                min = student.getAvgPoint();
            }
        }
        System.out.println("Lowest score" + min);
    }

    public void displayRank() {
        for (Student student : arrayList) {
            if (student.getAvgPoint() > 8.0) {
                System.out.println(student + " Rank :  Good standing");
            } else if (student.getAvgPoint() > 6.0 && student.getAvgPoint() < 8.0) {
                System.out.println(student + " Rank : Academic pretty");
            }else if (student.getAvgPoint()< 6.0 && student.getAvgPoint() > 4.5){
                System.out.println(student + " Rank :Academic performance");
            }else {
                System.out.println(student + " Rank : Poor academic performance");
            }
        }
    }

    public Student getIdStudent(int id) {
        for (Student student : arrayList) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }
}

