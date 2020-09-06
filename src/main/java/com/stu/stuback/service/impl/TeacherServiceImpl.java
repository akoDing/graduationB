package com.stu.stuback.service.impl;

import com.stu.stuback.entity.Teacher;
import com.stu.stuback.mapper.TeacherMapper;
import com.stu.stuback.service.TeacherService;
import com.stu.stuback.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public DataVO<Teacher> findData() {
        DataVO dataVO = new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(teacherMapper.selectCount(null));
        List<Teacher> teacherList = teacherMapper.selectList(null);
        dataVO.setData(teacherList);
        return dataVO;
    }
}
