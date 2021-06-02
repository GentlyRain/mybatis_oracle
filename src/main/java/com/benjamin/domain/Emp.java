package com.benjamin.domain;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {

    private Integer EMPNO;      // 雇员编号
    private String ENAME;       // 雇员姓名
    private String JOB;         // 雇员职位
    private Integer MGR;        // 雇员对应的领导的编号
    private Date HIREDATE;      // 雇员的雇佣日期
    private Integer SAL;        // 雇员的基本工资
    private Integer COMM;       // 奖金或补助
    private Integer DEPTNO;     // 所在部门


    public Integer getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(Integer EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public Integer getMGR() {
        return MGR;
    }

    public void setMGR(Integer MGR) {
        this.MGR = MGR;
    }

    public Date getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public Integer getSAL() {
        return SAL;
    }

    public void setSAL(Integer SAL) {
        this.SAL = SAL;
    }

    public Integer getCOMM() {
        return COMM;
    }

    public void setCOMM(Integer COMM) {
        this.COMM = COMM;
    }

    public Integer getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(Integer DEPTNO) {
        this.DEPTNO = DEPTNO;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "EMPNO=" + EMPNO +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR=" + MGR +
                ", HIREDATE=" + HIREDATE +
                ", SAL=" + SAL +
                ", COMM=" + COMM +
                ", DEPTNO=" + DEPTNO +
                '}';
    }
}
