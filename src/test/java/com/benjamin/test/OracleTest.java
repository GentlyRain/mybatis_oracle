package com.benjamin.test;

import com.benjamin.dao.IDeptDao;
import com.benjamin.dao.IEmpDao;
import com.benjamin.domain.Dept;
import com.benjamin.domain.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OracleTest {

    public static void main(String[] args) throws IOException {

        // 1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2.创建SqlSessionFactoryBuilder工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        // 3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        // 4.使用session创建dao的测试对象
        IEmpDao emp = session.getMapper(IEmpDao.class);     // 查询所有员工
        IDeptDao dept = session.getMapper(IDeptDao.class);  // 查询所有部门

        // 5.使用session对象执行方法
        List<Emp> empList = emp.selectAllEmps();
        for (Emp e : empList) {
            System.out.println(e);
        }
        System.out.println();
        List<Dept> deptList = dept.selectAllDepts();
        for (Dept d : deptList) {
            System.out.println(d);
        }

        // 6.关闭
        session.close();
        in.close();
    }
}
