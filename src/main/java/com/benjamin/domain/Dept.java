package com.benjamin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Integer DEPTNO;     // 部门编号
    private String DNAME;       // 部门名称
    private String LOC;         // 部门所在位置

}
