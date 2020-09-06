package com.stu.stuback.service;

import com.stu.stuback.entity.Teacher;
import com.stu.stuback.vo.DataVO;

public interface TeacherService {
    public DataVO<Teacher> findData();
}
