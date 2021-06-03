package com.benjamin.dao;

import com.benjamin.domain.Dept;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IDeptDao {

    // 查询所有部门
    List<Dept> selectAllDepts();
}
