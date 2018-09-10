package com.halous.parentsbase.dtos.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable{
    private String studentId;
    private String studentName;
    private String studentClass;

}
