package com.stu.stuback.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
    @TableId(value = "f_id") // 在自增主键的变量加上即可
    private String fId;
    private String fDepartmentId;
    private String fName;
    private Integer fGender;
    private Date fBirthday;
    private String fPid;
    private Integer fEducation;
    private String fPhone;
    private String fEmail;
    private String fPassword;
    private String fTitle;
    private String fPost;
    private Date fEmployDate;
    private Date fEntryDate;
    private Date fQuitDate;
}
