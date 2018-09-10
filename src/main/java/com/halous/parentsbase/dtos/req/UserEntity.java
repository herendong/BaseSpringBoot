package com.halous.parentsbase.dtos.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private long id;
    private String userName;
    private String passWord;
}
