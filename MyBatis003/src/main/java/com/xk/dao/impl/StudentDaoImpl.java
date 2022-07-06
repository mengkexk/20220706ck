package com.xk.dao.impl;

import com.xk.dao.StudentDao;
import com.xk.domain.Student;
import com.xk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        //获取sqlsession对象
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        String sqlid="com.xk.dao.StudentDao.selectStudents";
        List<Student> studentList=sqlSession.selectList(sqlid);
        sqlSession.close();
        return studentList;
    }
/*
传统使用dao方法：
1.定义dao接口，在定义一个类实现定义的dao接口的方法，在这个类中完成我们需要完成的功能，而在使用的时候，我们是直接调用这个类的方法的

* */
    @Override
    public int insertstudent(Student student) {
        //获取sqlsession对象
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        String sqlid="com.xk.dao.StudentDao.insertstudent";
        int nums=sqlSession.insert(sqlid,student);
        /*提交事务*/
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
}
