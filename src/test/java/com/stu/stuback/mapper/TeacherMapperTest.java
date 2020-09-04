package com.stu.stuback.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherMapperTest {

    @Autowired
    private TeacherMapper mapper;

    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }
}
