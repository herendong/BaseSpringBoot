package com.halous.parentsbase.repository;

import com.halous.parentsbase.repository.domain.OrupRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrupRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrupRole record);

    int insertSelective(OrupRole record);

    OrupRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrupRole record);

    int updateByPrimaryKey(OrupRole record);
}