package Minitest.Bai2;

import java.util.Scanner;

public class ClassroomManage {
    ClassRoom classRoom1 = new ClassRoom("C0223i1");
    ClassRoom classRoom2 = new ClassRoom("C0323i1");
    ClassRoom[] classRooms = {classRoom1, classRoom2};
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

}
