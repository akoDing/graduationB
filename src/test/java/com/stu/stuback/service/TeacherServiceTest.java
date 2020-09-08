package com.stu.stuback.service;

import com.stu.stuback.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherServiceTest {

    @Autowired
    private TeacherService service;

    @Test
    void findData() {
        DataVO dataVO = service.findData(1);
        int i = 0;
    }
}
