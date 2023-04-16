package Minitest.Bai1.Controller;

import Minitest.Bai1.Controller.Manager;
import Minitest.Bai1.Model.People;
import Minitest.Bai1.Model.Student;

import java.util.*;

public class PeopleManager implements Manager {
    ArrayList<People> person = new ArrayList<>();

    public PeopleManager() {

    }

    public PeopleManager(ArrayList<People> person) {
        this.person = person;
    }

    public ArrayList<People> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<People> person) {
        this.person = person;
    }

    @Override
    public void displayPeople() {
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }

    @Override
    public void addPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        People people = new People(name ,age);
        person.add(people);
    }
    @Override
    public void addStudent() {
        getPeople();
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm kiếm :");
        String nameSearch = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getName().contains(nameSearch)) {
                System.out.println(person.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }

    }

    @Override
    public void deletePeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên  id bạn muốn xóa :");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        if (idDelete != -1) {
            for (int i = 0; i < person.size(); i++) {
                if (idDelete == person.get(i).getId()) {
                    person.remove(i);
                    flag=true;
                }
            }if(!flag){
                System.out.println("không tìm thấy");
            }
        }else {
            System.out.println("Không có id trong danh sách");
        }
    }

    @Override
    public void editPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên id bạn muốn sửa :");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        if (idEdit != -1) {
            for (int i = 0; i < person.size(); i++){
                if (idEdit == person.get(i).getId()) {
                    System.out.println("Nhập  tên bạn muốn sửa");
                    String name = scanner.nextLine();
                    person.get(i).setName(name);
                    System.out.println("Nhập tuổi bạn muốn sửa");
                    int age = Integer.parseInt(scanner.nextLine());
                    person.get(i).setAge(age);
                    flag=true;
                    if (person.get(i)instanceof Student){
                        System.out.println("Mời nhập vào điểm TB mới");
                        ((Student) person.get(i)).setAvg(Double.parseDouble(scanner.nextLine()));
                    }
                }
            }if(!flag){
                System.out.println("không tìm thấy");
            }
        }else {
            System.out.println("không có id trong danh sách");
        }
    }

    @Override
    public void arrangeAvg() {
        person.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    return (int) ((Student) o1).getAvg() - (int) ((Student) o2).getAvg();
                }

                return 0;
            }
        });
    }

    @Override
    public void sumAvg() {
        double sum = 0;
        for (int i = 0; i < person.size(); i++) {
            Student student = (Student) person.get(i);
            sum += student.getAvg();
        }
        System.out.println("Tổng điểm trung bình là :" + sum);
    }

    public void getPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm :");
        double avg = Double.parseDouble(scanner.nextLine());
        People student = new Student(name, age, avg);
        person.add(student);
    }

}

