package com.benjamin.dao;

import com.benjamin.domain.President;

import java.util.List;

/**
 * 持久层接口
 */
public interface IPresidentDao {

    // 添加一条记录
    void insertPresident(President president);

    // 获取所有记录
    List<President> getAllPresidents();
}
