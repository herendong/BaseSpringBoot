package com.halous.parentsbase.repository;

import com.halous.parentsbase.repository.domain.OrupRolePrivilege;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrupRolePrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrupRolePrivilege record);

    int insertSelective(OrupRolePrivilege record);

    OrupRolePrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrupRolePrivilege record);

    int updateByPrimaryKey(OrupRolePrivilege record);
}