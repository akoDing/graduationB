package com.stu.stuback.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
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
