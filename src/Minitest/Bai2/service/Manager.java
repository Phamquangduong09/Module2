package Minitest.Bai2.service;

import java.util.List;

public interface Manager<E> {
    List<E> addStudent();

   List<E> updateStudent();

    E deleteStudent();

    void search();

    void displayStudent();

}
