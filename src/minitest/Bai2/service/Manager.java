package minitest.Bai2.service;

import java.io.IOException;
import java.util.List;

public interface Manager<E> {
    List<E> addStudent();

    List<E> updateStudent();

    E deleteStudent() throws IOException;

    void search();

    void displayStudent();

}
