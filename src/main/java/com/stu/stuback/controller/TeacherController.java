package com.stu.stuback.controller;

import com.stu.stuback.service.TeacherService;
import com.stu.stuback.vo.DataVO;
import com.stu.stuback.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher/list")
    public DataVO list(){
        return  teacherService.findData();
    }

    @PostMapping("/teacher/add")
    public DataVO add(@RequestBody TeacherVO teacherVO){
        return teacherService.saveData(teacherVO);
    }


}
