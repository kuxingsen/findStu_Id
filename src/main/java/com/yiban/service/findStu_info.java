package com.yiban.service;

import com.yiban.Mapper.StudentMapper;
import com.yiban.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title:service </p>
 * <p>Description:查询学生信息的service类 </p>
 *
 * @author 郑达成
 * @date 2018/7/17 22:50
 */
@Service
public class findStu_info {
    @Autowired
    private StudentMapper studentMapper;

    /**
     *
     * @param id
     * @return 利用mapper去数据库查找学生stu_id、name、major、department数据
     */
    public Student select(String id,String name){

        return studentMapper.select(id,name);
    }
}
