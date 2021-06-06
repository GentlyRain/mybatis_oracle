package com.benjamin.dao;

import com.benjamin.domain.Emp;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IEmpDao {

    // 查询所有员工
    List<Emp> selectAllEmps();

    // 根据员工编号查找
    List<Emp> selectEmpsByEmpNo(Integer empNo);

    // 根据名称查找（模糊查询）
    List<Emp> selectEmpsByEName(String eName);
}
