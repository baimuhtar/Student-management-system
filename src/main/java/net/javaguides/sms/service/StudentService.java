package net.javaguides.sms.service;

import net.javaguides.sms.entity.Student;

import java.util.List;

public interface StudentService {
    Student getById(Long id);

    void createStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getAllStudents();
}
