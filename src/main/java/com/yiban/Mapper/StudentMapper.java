package com.yiban.Mapper;

import com.yiban.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 学生的访问数据库的Mapper接口
 */
@Repository
public interface StudentMapper {
    Student select(@Param("id") String id, @Param("name") String name);
}
