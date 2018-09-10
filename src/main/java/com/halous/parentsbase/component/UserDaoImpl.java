package com.halous.parentsbase.component;

import com.halous.parentsbase.Iservice.UserDao;
import com.halous.parentsbase.dtos.req.Student;
import com.halous.parentsbase.dtos.req.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(UserEntity user) {
        mongoTemplate.save(user);
    }

    @Override
    public UserEntity findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        UserEntity one = mongoTemplate.findOne(query, UserEntity.class);
        return one;
    }

    @Override
    public void updateUser(UserEntity user) {

    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void saveUser(Student user) {
            mongoTemplate.save(user);
    }
}
