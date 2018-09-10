package com.halous.parentsbase.repository;

import com.halous.parentsbase.repository.domain.OrupPrivilege;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrupPrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrupPrivilege record);

    int insertSelective(OrupPrivilege record);

    OrupPrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrupPrivilege record);

    int updateByPrimaryKey(OrupPrivilege record);
}