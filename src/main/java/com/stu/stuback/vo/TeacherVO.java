package com.stu.stuback.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class TeacherVO {
    @JsonProperty("id")
    private String fId;
    @JsonProperty("department")
    private Integer fDepartmentId;
    @JsonProperty("name")
    private String fName;
    @JsonProperty("gender")
    private Integer fGender;
    @JsonProperty("birthday")
    private Date fBirthday;
    @JsonProperty("pid")
    private String fPid;
    @JsonProperty("education")
    private Integer fEducation;
    @JsonProperty("phone")
    private String fPhone;
    @JsonProperty("email")
    private String fEmail;
    @JsonProperty("password")
    private String fPassword;
    @JsonProperty("title")
    private String fTitle;
    @JsonProperty("post")
    private String fPost;
}
