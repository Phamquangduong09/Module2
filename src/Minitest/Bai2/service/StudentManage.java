package Minitest.Bai2.service;

import Minitest.Bai2.model.ClassRoom;
import Minitest.Bai2.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage implements Manager<Student> {
    static ArrayList<Student> arrayList = new ArrayList<>();
    ClassroomManage classroomManage = new ClassroomManage();

    public StudentManage() {
        try {
            readFileStudent();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public ArrayList<Student> addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
        System.out.println("Enter Age ");
        int age;
        do {
            age = Integer.parseInt(scanner.nextLine());
        } while (age < 6 || age > 60);
        String gender = chooseGender();
        System.out.println("Enter point");
        double point;
        do {
            point = Integer.parseInt(scanner.nextLine());
        } while (point < 0 || point > 10);
        classroomManage.displayClassroom();
        System.out.println("Enter Class");
        ClassRoom classes = classroomManage.chooseClassroom();
        Student student = new Student(name, age, gender, point, classes);
        arrayList.add(student);
        writeFileStudent();
        return arrayList;
    }

    @Override
    public ArrayList<Student> updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id update");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (Student list : arrayList) {
            if (idUpdate == list.getId()) {
                System.out.println("Enter Name ");
                String name = scanner.nextLine();
                list.setName(name);
                System.out.println("Enter Age ");
                int age;
                do {
                    age = Integer.parseInt(scanner.nextLine());
                } while (age < 6 || age > 60);
                list.getAge(age);
                String gender = chooseGender();
                list.setGender(gender);
                System.out.println("Enter point");
                double point;
                do {
                    point = Integer.parseInt(scanner.nextLine());
                } while (point < 0 || point > 10);
                list.setAvgPoint(point);
                classroomManage.displayClassroom();
                System.out.println("Enter Class");
                ClassRoom classes = classroomManage.chooseClassroom();
                list.setClassRoom(classes);
                writeFileStudent();
            }
        }
        return arrayList;
    }

    @Override
    public Student deleteStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        Student student = getStudent(idDelete);
        if (student != null) {
            arrayList.remove(student);
            writeFileStudent();
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
            if (student.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
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

    public void displayStudentById() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to find");
        int idToFind = Integer.parseInt(sc.nextLine());
        int id = getIdStudent1(idToFind);
        if (id != -1) {
            System.out.println(arrayList.get(id));
        } else {
            System.out.println("No information");
        }

    }

    public void displayStudentByClass() throws IOException {
        Scanner scanner = new Scanner(System.in);
        classroomManage.displayClassroom();
        System.out.println("Enter the classroom you want to display");
        String classRoom = scanner.nextLine();
        for (Student st : arrayList) {
            if (classRoom.contains(st.getClassRoom().getName())) {
                System.out.println(st);
            }
        }


    }

    public void displayHighestPoint() throws IOException {
        double max = arrayList.get(0).getAvgPoint();
        Student maxPoint = arrayList.get(0);
        for (Student student : arrayList) {
            if (max < student.getAvgPoint()) {
                max = student.getAvgPoint();
                maxPoint = student;
            }
        }
        System.out.println("Highest point :" + maxPoint + " " + max);
    }

    public void displayLowestScore() throws IOException {

        double min = arrayList.get(0).getAvgPoint();
        Student minPoint = arrayList.get(0);
        for (Student student : arrayList) {
            if (min > student.getAvgPoint()) {
                min = student.getAvgPoint();
                minPoint = student;
            }
        }
        System.out.println("Lowest score" + minPoint + " " + min);
    }

    public void displayRank() throws IOException {
        for (Student student : arrayList) {
            if (student.getAvgPoint() > 8.0) {
                System.out.println(student + " Rank :  Good standing");
            } else if (student.getAvgPoint() > 6.0 && student.getAvgPoint() < 8.0) {
                System.out.println(student + " Rank : Academic pretty");
            } else if (student.getAvgPoint() < 6.0 && student.getAvgPoint() > 4.5) {
                System.out.println(student + " Rank :Academic performance");
            } else {
                System.out.println(student + " Rank : Poor academic performance");
            }
        }
    }

    public void displayStudentByGender() throws IOException {
        System.out.println("Select the gender you want to display");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. other");
        Scanner scanner = new Scanner(System.in);
        int gender = Integer.parseInt(scanner.nextLine());
        if (gender == 1) {
            getStudentByGender("Male");
        } else if (gender == 2) {
            getStudentByGender("Female");
        } else {
            getStudentByGender("Other");
        }

    }

    public Student getStudent(int id) {
        for (Student student : arrayList) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    public int getIdStudent1(int id) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == arrayList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void getStudentByGender(String gender) {
        for (Student list : arrayList) {
            if (list.getGender().equalsIgnoreCase(gender)) {
                System.out.println(list);
            }
        }
    }

    public void addClass() {
        classroomManage.addClassroom();
    }

    public void updateClass() {
        classroomManage.updateClass();
    }

    public void writeFileStudent() {
        File file = new File("C:\\C0223i1\\Module2\\src\\Minitest\\Bai2\\Data\\Student");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Directory does not exist");
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : arrayList) {
                bufferedWriter.write(s.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void readFileStudent() throws IOException {
        File file = new File("C:\\C0223i1\\Module2\\src\\Minitest\\Bai2\\Data\\Student");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String student;
        String[] str;
        while ((student = bufferedReader.readLine()) != null) {
            str = student.split(",");
            arrayList.add(new Student(str[1], Integer.parseInt(str[2]), str[3], Double.parseDouble(str[4]), new ClassRoom(str[6])));
        }
        bufferedReader.close();
        fileReader.close();
    }
}




