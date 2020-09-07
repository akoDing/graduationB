package com.stu.stuback.service;

import com.stu.stuback.entity.Teacher;
import com.stu.stuback.vo.DataVO;
import com.stu.stuback.vo.TeacherVO;

public interface TeacherService {
    public DataVO<TeacherVO> findData();
}
