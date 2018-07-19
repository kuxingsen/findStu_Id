package com.yiban.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yiban.entity.Dictionary;
import com.yiban.entity.Result;
import com.yiban.entity.Student;
import com.yiban.service.findStu_info;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * <p>Title: Controller</p>
 * <p>Description:处理学生查询页面信息的controller </p>
 *
 * @author 郑达成
 * @date 2018/7/17 22:52
 */
@Controller
@RequestMapping(value = "/YiBan")
public class StudentController {
    @Autowired
    private findStu_info findStu_info;

    @RequestMapping(value = "/findStuId")
    public ModelAndView toGetIndex(ModelAndView modelAndView){
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping(value="/formSubmit",method=RequestMethod.POST)
    public @ResponseBody Result dealStu_info( Student student, HttpSession session){
        System.out.println(student);
//        获取学生姓名
        String name=student.getName();
//        获取学生高考证号
        String exNum=student.getExNum();
//        判断学生传过来的信息是否为空
        if (findStu_info.select(exNum,name)==null){
            return new Result(Dictionary.MESSAGE_LOSS);
//            return informationHandler.insert(student);
        }else {
            student=findStu_info.select(exNum,name);
            return new Result<Student>(Dictionary.SUCCESS,student);
        }
    }
}
