package com.xk;

import com.xk.dao.StudentDao;
import com.xk.dao.impl.StudentDaoImpl;
import com.xk.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    @Test
    public void testselectstudents(){
        StudentDao dao=new StudentDaoImpl();
        List<Student> studentList = dao.selectStudents();
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }
    @Test
    public void testinsertstudents(){
        StudentDao dao=new StudentDaoImpl();
       Student student=new Student();
       student.setUname("wansh");
       student.setXuehao("209999");
       student.setUsex("nv");
       student.setZhuanye("软件专业");
       student.setTupian("暂无图片");
       int ok= dao.insertstudent(student);
        System.out.println("添加对象的数量："+ok);
    }
}
