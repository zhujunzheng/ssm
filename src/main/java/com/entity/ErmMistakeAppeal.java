package com.entity;

import java.sql.Timestamp;

/**
 * 差错申诉
 */
public class ErmMistakeAppeal {

  private long mistakeAppealId;
  private String mistakeCode;
  private long type;
  private String appealerCode;
  private String appealer;
  private java.sql.Timestamp appealTime;
  private String appealReason;
  private String appealDepartment;
  private String appealDepartmentCode;
  private String compCode;
  private String orgType;
  private String creater;
  private java.sql.Timestamp createTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp latestTime;
  private double recordVersion;


  public long getMistakeAppealId() {
    return mistakeAppealId;
  }

  public void setMistakeAppealId(long mistakeAppealId) {
    this.mistakeAppealId = mistakeAppealId;
  }


  public String getMistakeCode() {
    return mistakeCode;
  }

  public void setMistakeCode(String mistakeCode) {
    this.mistakeCode = mistakeCode;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getAppealerCode() {
    return appealerCode;
  }

  public void setAppealerCode(String appealerCode) {
    this.appealerCode = appealerCode;
  }


  public String getAppealer() {
    return appealer;
  }

  public void setAppealer(String appealer) {
    this.appealer = appealer;
  }


  public java.sql.Timestamp getAppealTime() {
    return appealTime;
  }

  public void setAppealTime(java.sql.Timestamp appealTime) {
    this.appealTime = appealTime;
  }


  public String getAppealReason() {
    return appealReason;
  }

  public void setAppealReason(String appealReason) {
    this.appealReason = appealReason;
  }


  public String getAppealDepartment() {
    return appealDepartment;
  }

  public void setAppealDepartment(String appealDepartment) {
    this.appealDepartment = appealDepartment;
  }


  public String getAppealDepartmentCode() {
    return appealDepartmentCode;
  }

  public void setAppealDepartmentCode(String appealDepartmentCode) {
    this.appealDepartmentCode = appealDepartmentCode;
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


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }


  public java.sql.Timestamp getModifierTime() {
    return modifierTime;
  }

  public void setModifierTime(java.sql.Timestamp modifierTime) {
    this.modifierTime = modifierTime;
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

  public ErmMistakeAppeal(String mistakeCode, long type, String appealerCode, String appealer, Timestamp appealTime, String appealReason, String appealDepartment, String appealDepartmentCode, String compCode, String orgType, String creater, Timestamp createTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp latestTime, double recordVersion) {
    this.mistakeCode = mistakeCode;
    this.type = type;
    this.appealerCode = appealerCode;
    this.appealer = appealer;
    this.appealTime = appealTime;
    this.appealReason = appealReason;
    this.appealDepartment = appealDepartment;
    this.appealDepartmentCode = appealDepartmentCode;
    this.compCode = compCode;
    this.orgType = orgType;
    this.creater = creater;
    this.createTime = createTime;
    this.modifier = modifier;
    this.modifierTime = modifierTime;
    this.isDelete = isDelete;
    this.latestTime = latestTime;
    this.recordVersion = recordVersion;
  }

  public ErmMistakeAppeal() {
  }
}
