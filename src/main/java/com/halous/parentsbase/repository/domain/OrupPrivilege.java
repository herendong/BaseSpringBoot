package com.halous.parentsbase.repository.domain;

public class OrupPrivilege {
    private Integer id;

    private String name;

    private Integer type;

    private Integer parent;

    private String remark;

    private String privilegeidentity;

    private Integer departId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPrivilegeidentity() {
        return privilegeidentity;
    }

    public void setPrivilegeidentity(String privilegeidentity) {
        this.privilegeidentity = privilegeidentity == null ? null : privilegeidentity.trim();
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }
}