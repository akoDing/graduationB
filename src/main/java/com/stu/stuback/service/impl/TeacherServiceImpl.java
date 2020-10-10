package com.stu.stuback.service.impl;

import com.stu.stuback.entity.Teacher;
import com.stu.stuback.mapper.TeacherMapper;
import com.stu.stuback.service.TeacherService;
import com.stu.stuback.utils.ResultVOUtil;
import com.stu.stuback.vo.DataVO;
import com.stu.stuback.vo.TeacherVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public DataVO<TeacherVO> findData() {
        // DataVO dataVO = new DataVO();
        // dataVO.setCode(0);
        // dataVO.setMsg("");
        // dataVO.setCount(teacherMapper.selectCount(null));
        List<Teacher> teacherList = teacherMapper.selectList(null);
        List<TeacherVO> teacherVOList = new ArrayList<>();
        for (Teacher teacher: teacherList) {
            TeacherVO teacherVO = new TeacherVO();
            BeanUtils.copyProperties(teacher, teacherVO);
            teacherVOList.add(teacherVO);
        }
        // dataVO.setData(teacherVOList);
        return ResultVOUtil.success(teacherVOList, teacherMapper.selectCount(null));
        // return dataVO;
    }

    @Override
    public DataVO saveData(TeacherVO teacherVO) {
        // DataVO dataVO = new DataVO();
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherVO, teacher);
        int i = teacherMapper.insert(teacher);
        // List<TeacherVO> teacherVOList = new ArrayList<>();
        // BeanUtils.copyProperties(teacher, teacherVO);
        // teacherVOList.add(teacherVO);
        // dataVO.setData(teacherVOList);
       System.out.println(i);

        return ResultVOUtil.success();
    }

}
