package com.entity;

import java.sql.Timestamp;

/**
 *差错流转表
 */

public class ErmMistakeExchange {

  private long mistakeExchangeId;
  private String mistakeCode;
  private String assignerCode;
  private String assigner;
  private java.sql.Timestamp assignIme;
  private String receiverCode;
  private String receiver;
  private String department;
  private String departmentCode;
  private long type;
  private String remark;
  private String compCode;
  private String orgType;
  private String creater;
  private java.sql.Timestamp createTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp latestTime;
  private double recordVersion;


  public long getMistakeExchangeId() {
    return mistakeExchangeId;
  }

  public void setMistakeExchangeId(long mistakeExchangeId) {
    this.mistakeExchangeId = mistakeExchangeId;
  }


  public String getMistakeCode() {
    return mistakeCode;
  }

  public void setMistakeCode(String mistakeCode) {
    this.mistakeCode = mistakeCode;
  }


  public String getAssignerCode() {
    return assignerCode;
  }

  public void setAssignerCode(String assignerCode) {
    this.assignerCode = assignerCode;
  }


  public String getAssigner() {
    return assigner;
  }

  public void setAssigner(String assigner) {
    this.assigner = assigner;
  }


  public java.sql.Timestamp getAssignIme() {
    return assignIme;
  }

  public void setAssignIme(java.sql.Timestamp assignIme) {
    this.assignIme = assignIme;
  }


  public String getReceiverCode() {
    return receiverCode;
  }

  public void setReceiverCode(String receiverCode) {
    this.receiverCode = receiverCode;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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

  public ErmMistakeExchange(long mistakeExchangeId, String mistakeCode, String assignerCode, String assigner, Timestamp assignIme, String receiverCode, String receiver, String department, String departmentCode, long type, String remark, String compCode, String orgType, String creater, Timestamp createTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp latestTime, double recordVersion) {
    this.mistakeExchangeId = mistakeExchangeId;
    this.mistakeCode = mistakeCode;
    this.assignerCode = assignerCode;
    this.assigner = assigner;
    this.assignIme = assignIme;
    this.receiverCode = receiverCode;
    this.receiver = receiver;
    this.department = department;
    this.departmentCode = departmentCode;
    this.type = type;
    this.remark = remark;
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

  public ErmMistakeExchange() {
  }
}
