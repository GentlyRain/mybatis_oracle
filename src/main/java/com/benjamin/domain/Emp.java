package com.benjamin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Emp implements Serializable {

    private Integer EMPNO;      // 雇员编号
    private String ENAME;       // 雇员姓名
    private String JOB;         // 雇员职位
    private Integer MGR;        // 雇员对应的领导的编号
    private Date HIREDATE;      // 雇员的雇佣日期
    private Integer SAL;        // 雇员的基本工资
    private Integer COMM;       // 奖金或补助
    private Integer DEPTNO;     // 所在部门

}
