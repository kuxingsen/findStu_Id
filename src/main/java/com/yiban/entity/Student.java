package com.yiban.entity;

import java.io.Serializable;

/**
 * <p>Title: entity类--javabean</p>
 * <p>Description:学生信息实体类 </p>
 *
 * @author 郑达成
 * @date 2018/7/17 22:29
 */
public class Student implements Serializable {

    //    学生id
    private String stu_id;
    //    学生高考准考证号
    private String exNum;
    //    学生姓名
    private String name;
    //    学院
    private String department;
    //    学生专业
    private String major;

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getExNum() {
        return exNum;
    }

    public void setExNum(String exNum) {
        this.exNum = exNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return "Student{" +
                ", stu_id='" + stu_id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", exNum='" + exNum + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
