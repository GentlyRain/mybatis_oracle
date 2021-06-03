package com.benjamin.domain;

import java.io.Serializable;

public class Dept implements Serializable {

    private Integer DEPTNO;     // 部门编号
    private String DNAME;       // 部门名称
    private String LOC;         // 部门所在位置


    public Integer getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(Integer DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "DEPTNO=" + DEPTNO +
                ", DNAME='" + DNAME + '\'' +
                ", LOC='" + LOC + '\'' +
                '}';
    }
}
