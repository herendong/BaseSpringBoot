package com.halous.parentsbase.repository;

import com.halous.parentsbase.repository.domain.OrupUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrupUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrupUser record);

    int insertSelective(OrupUser record);

    OrupUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrupUser record);

    int updateByPrimaryKey(OrupUser record);
}