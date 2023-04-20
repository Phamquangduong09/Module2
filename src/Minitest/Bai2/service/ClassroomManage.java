package Minitest.Bai2.service;

import Minitest.Bai2.model.ClassRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage {
    ArrayList<ClassRoom> classRooms = new ArrayList<>();
    ClassRoom classRoom1 = new ClassRoom("C0223i1");
    ClassRoom classRoom2 = new ClassRoom("C0323i1");

    public ClassroomManage() {
        classRooms.add(classRoom1);
        classRooms.add(classRoom2);
    }

    public ClassroomManage(ArrayList<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }

    public void displayClassroom() {
        for (ClassRoom c : classRooms) {
            System.out.println(c);
        }
    }

    public ClassRoom chooseClassroom() {
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        ClassRoom idClass = new ClassRoom();
        for (ClassRoom c : classRooms) {
            if (choice == c.getId()) {
                idClass = c;
            }
        }
        return idClass;
    }

    public void addClassroom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name class");
        String name = scanner.nextLine();
        ClassRoom classRoom = new ClassRoom(name);
        classRooms.add(classRoom);
    }
    public void updateClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id class");
        int idUpdateClass=Integer.parseInt(scanner.nextLine());
        for (ClassRoom c:classRooms) {
            if(idUpdateClass == c.getId()){
                System.out.println("Enter name class");
                String name = scanner.nextLine();
                c.setName(name);
            }
        }
        displayClassroom();
    }

}
