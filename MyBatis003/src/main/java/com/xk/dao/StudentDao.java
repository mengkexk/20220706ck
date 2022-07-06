package com.xk.dao;

import com.xk.domain.Student;

import java.util.List;

public interface StudentDao {
     public List<Student> selectStudents();
     public int insertstudent(Student student);
}
