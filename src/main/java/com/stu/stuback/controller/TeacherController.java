package com.stu.stuback.controller;

import com.stu.stuback.service.TeacherService;
import com.stu.stuback.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/list")
    public DataVO list(Integer page){
        return  teacherService.findData(page);
    }


}
