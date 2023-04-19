package Minitest.Bai2;

import java.util.List;

public interface Manager<E> {
    List<E> addStudent();

    void updateStudent();

    E deleteStudent();

    void search();

    void displayStudent();

}
