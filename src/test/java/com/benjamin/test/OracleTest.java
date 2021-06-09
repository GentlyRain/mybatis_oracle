package com.benjamin.test;

import com.benjamin.dao.IDeptDao;
import com.benjamin.dao.IEmpDao;
import com.benjamin.dao.IPresidentDao;
import com.benjamin.domain.Dept;
import com.benjamin.domain.Emp;
import com.benjamin.domain.President;
import com.benjamin.utils.DateUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OracleTest {

    private InputStream in;
    private SqlSession session;
    private IEmpDao empDao;
    private IPresidentDao presidentDao;

    @Before
    public void init() throws IOException {

        // 1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2.创建SqlSessionFactoryBuilder工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        // 3.使用工厂生产SqlSession对象
        session = factory.openSession();

        // 4.获取dao代理对象
        empDao = session.getMapper(IEmpDao.class);
        presidentDao = session.getMapper(IPresidentDao.class);
    }

    @After
    public void destory() throws IOException {

        // 提交事务
        session.commit();

        // 6.关闭
        session.close();
        in.close();
    }



//    public static void main(String[] args) throws IOException {
//
//        // 1.读取配置文件
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//
//        // 2.创建SqlSessionFactoryBuilder工厂
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//
//        // 3.使用工厂生产SqlSession对象
//        SqlSession session = factory.openSession();
//
//        // 4.使用session创建dao的测试对象
//        IEmpDao emp = session.getMapper(IEmpDao.class);     // 查询所有员工
//        IDeptDao dept = session.getMapper(IDeptDao.class);  // 查询所有部门
//
//        // 5.使用session对象执行方法
//        List<Emp> empList = emp.selectAllEmps();
//        for (Emp e : empList) {
//            System.out.println(e);
//        }
//        System.out.println();
//        List<Dept> deptList = dept.selectAllDepts();
//        for (Dept d : deptList) {
//            System.out.println(d);
//        }
//
//        // 6.关闭
//        session.close();
//        in.close();
//    }



    /**
     * 测试查询所有雇员
     */
    @Test
    public void testSelectAllEmps() {

        // 5.使用session对象执行方法
        List<Emp> empList = empDao.selectAllEmps();

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }



    /**
     * 测试根据员工编号查找
     */
    @Test
    public void testSelectEmpsByEmpNo() {

        Integer empNo = 7654;

        // 5.使用session对象执行方法
        List<Emp> empList = empDao.selectEmpsByEmpNo(empNo);

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }



    /**
     * 测试根据名称查找（模糊查询）
     */
    @Test
    public void testSelectEmpsByEName() {

        String eName = "S";

        // 5.使用session对象执行方法
        List<Emp> empList = empDao.selectEmpsByEName("%" + eName + "%");

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }


    // -----------------------------------------------------------------------------


    /**
     * 添加一条记录
     */
    @Test
    public void testInsertPresident() {

        President president = new President();
        president.setId(1);
        president.setName("Donald John Trump");
        president.setGender("male");
        president.setBrithday("1946-06-14");
        president.setAge(74);
        president.setTerm("2017.01.20~2021.01.20");
        president.setParty("Republican Party");

        presidentDao.insertPresident(president);
    }


    /**
     * 获取所有记录
     */
    @Test
    public void testGetAllPresidents() {

        List<President> presidentList = presidentDao.getAllPresidents();
        for (President president : presidentList) {
            System.out.println(president);
        }
    }
}
