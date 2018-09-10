package com.halous.parentsbase.repository;

import com.halous.parentsbase.repository.domain.OrupUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrupUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrupUserRole record);

    int insertSelective(OrupUserRole record);

    OrupUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrupUserRole record);

    int updateByPrimaryKey(OrupUserRole record);
}