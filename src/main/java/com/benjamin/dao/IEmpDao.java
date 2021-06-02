package com.benjamin.dao;

import com.benjamin.domain.Emp;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IEmpDao {

    // 查询所有员工
    List<Emp> selectAllEmps();
}
