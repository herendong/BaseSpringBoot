package com.halous.parentsbase.service;


import com.halous.parentsbase.repository.OrupUserMapper;
import com.halous.parentsbase.repository.domain.OrupUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private OrupUserMapper orupUserMapper;

    public void queryUserInfo(String uid){
        OrupUser orupUser = new OrupUser();
        orupUser.setLoginname("ssss");
        orupUserMapper.insert(orupUser);
    }
}
