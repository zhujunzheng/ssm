package com.entity;

import java.sql.Timestamp;

/**
 * 差错处理明细
 */

public class ErmMistakeDisposeDetail {

  private long mistakeDisposeDetailId;
  private ErmMistakeDispose mistakeDisposeId;
  private String dutyDepartment;
  private String dutyDepartmentCode;
  private String dutyProvince;
  private String dutyProvinceCode;
  private String dutyCompany;
  private String dutyCompanyCode;
  private double punishMoney;
  private String dutyPeopleCode;
  private String dutyPeopleName;
  private String compCode;
  private String orgType;
  private String creater;
  private java.sql.Timestamp createTime;
  private long isDelete;
  private java.sql.Timestamp latestTime;
  private double recordVersion;


  public long getMistakeDisposeDetailId() {
    return mistakeDisposeDetailId;
  }

  public void setMistakeDisposeDetailId(long mistakeDisposeDetailId) {
    this.mistakeDisposeDetailId = mistakeDisposeDetailId;
  }

  public ErmMistakeDispose getMistakeDisposeId() {
    return mistakeDisposeId;
  }

  public void setMistakeDisposeId(ErmMistakeDispose mistakeDisposeId) {
    this.mistakeDisposeId = mistakeDisposeId;
  }

  public String getDutyDepartment() {
    return dutyDepartment;
  }

  public void setDutyDepartment(String dutyDepartment) {
    this.dutyDepartment = dutyDepartment;
  }


  public String getDutyDepartmentCode() {
    return dutyDepartmentCode;
  }

  public void setDutyDepartmentCode(String dutyDepartmentCode) {
    this.dutyDepartmentCode = dutyDepartmentCode;
  }


  public String getDutyProvince() {
    return dutyProvince;
  }

  public void setDutyProvince(String dutyProvince) {
    this.dutyProvince = dutyProvince;
  }


  public String getDutyProvinceCode() {
    return dutyProvinceCode;
  }

  public void setDutyProvinceCode(String dutyProvinceCode) {
    this.dutyProvinceCode = dutyProvinceCode;
  }


  public String getDutyCompany() {
    return dutyCompany;
  }

  public void setDutyCompany(String dutyCompany) {
    this.dutyCompany = dutyCompany;
  }


  public String getDutyCompanyCode() {
    return dutyCompanyCode;
  }

  public void setDutyCompanyCode(String dutyCompanyCode) {
    this.dutyCompanyCode = dutyCompanyCode;
  }


  public double getPunishMoney() {
    return punishMoney;
  }

  public void setPunishMoney(double punishMoney) {
    this.punishMoney = punishMoney;
  }


  public String getDutyPeopleCode() {
    return dutyPeopleCode;
  }

  public void setDutyPeopleCode(String dutyPeopleCode) {
    this.dutyPeopleCode = dutyPeopleCode;
  }


  public String getDutyPeopleName() {
    return dutyPeopleName;
  }

  public void setDutyPeopleName(String dutyPeopleName) {
    this.dutyPeopleName = dutyPeopleName;
  }


  public String getCompCode() {
    return compCode;
  }

  public void setCompCode(String compCode) {
    this.compCode = compCode;
  }


  public String getOrgType() {
    return orgType;
  }

  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }


  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }


  public java.sql.Timestamp getLatestTime() {
    return latestTime;
  }

  public void setLatestTime(java.sql.Timestamp latestTime) {
    this.latestTime = latestTime;
  }


  public double getRecordVersion() {
    return recordVersion;
  }

  public void setRecordVersion(double recordVersion) {
    this.recordVersion = recordVersion;
  }

  public ErmMistakeDisposeDetail(long mistakeDisposeDetailId, ErmMistakeDispose mistakeDisposeId, String dutyDepartment, String dutyDepartmentCode, String dutyProvince, String dutyProvinceCode, String dutyCompany, String dutyCompanyCode, double punishMoney, String dutyPeopleCode, String dutyPeopleName, String compCode, String orgType, String creater, Timestamp createTime, long isDelete, Timestamp latestTime, double recordVersion) {
    this.mistakeDisposeDetailId = mistakeDisposeDetailId;
    this.mistakeDisposeId = mistakeDisposeId;
    this.dutyDepartment = dutyDepartment;
    this.dutyDepartmentCode = dutyDepartmentCode;
    this.dutyProvince = dutyProvince;
    this.dutyProvinceCode = dutyProvinceCode;
    this.dutyCompany = dutyCompany;
    this.dutyCompanyCode = dutyCompanyCode;
    this.punishMoney = punishMoney;
    this.dutyPeopleCode = dutyPeopleCode;
    this.dutyPeopleName = dutyPeopleName;
    this.compCode = compCode;
    this.orgType = orgType;
    this.creater = creater;
    this.createTime = createTime;
    this.isDelete = isDelete;
    this.latestTime = latestTime;
    this.recordVersion = recordVersion;
  }

  public ErmMistakeDisposeDetail() {
  }
}
