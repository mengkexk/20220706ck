package com.xk.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*写这个工具类的目的：
1.简化需要多次重复写的代码；
2.SqlSessionFactory ： 重量级对象， 程序创建一个对象耗时比较长，使用资源比较多。  整个项目中，有一个就够用了。
（怎么实现就只有一个那？ 答：写一个得到SqlSession对象的工具类，在类中使用静态代码块得到SqlSessionFactory对象，因为静态代码快在类加载的时候执行，并且只执行一次）
*/
public class MyBatisUtils {
    private  static SqlSessionFactory factory=null;
    static {
        String config="mybatis.xml";/*定义文件路径的变量*/
        try {
            InputStream in= Resources.getResourceAsStream(config);/*获取配置文件*/
            /*创建SqlSessionFactory对象，使用SqlSessionFactoryBuilder*/
            factory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if (factory!=null){
            sqlSession=factory.openSession();/*非自动提交事务的*/
        }
        return sqlSession;
    }
}
