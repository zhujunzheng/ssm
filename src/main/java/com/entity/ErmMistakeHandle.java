package com.entity;

import java.sql.Timestamp;

/**
 * 差错审核表
 */
public class ErmMistakeHandle {

  private long mistakeReviewId;
  private long keyId;
  private long isPass;
  private String content;
  private long returnType;
  private java.sql.Timestamp handleTime;
  private String handlerCode;
  private String handler;
  private String department;
  private String departmentCode;
  private String compCode;
  private String orgType;
  private String creater;
  private java.sql.Timestamp createTime;
  private String modifie;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp latestTime;
  private double recordVersion;


  public long getMistakeReviewId() {
    return mistakeReviewId;
  }

  public void setMistakeReviewId(long mistakeReviewId) {
    this.mistakeReviewId = mistakeReviewId;
  }


  public long getKeyId() {
    return keyId;
  }

  public void setKeyId(long keyId) {
    this.keyId = keyId;
  }


  public long getIsPass() {
    return isPass;
  }

  public void setIsPass(long isPass) {
    this.isPass = isPass;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getReturnType() {
    return returnType;
  }

  public void setReturnType(long returnType) {
    this.returnType = returnType;
  }


  public java.sql.Timestamp getHandleTime() {
    return handleTime;
  }

  public void setHandleTime(java.sql.Timestamp handleTime) {
    this.handleTime = handleTime;
  }


  public String getHandlerCode() {
    return handlerCode;
  }

  public void setHandlerCode(String handlerCode) {
    this.handlerCode = handlerCode;
  }


  public String getHandler() {
    return handler;
  }

  public void setHandler(String handler) {
    this.handler = handler;
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


  public String getModifie() {
    return modifie;
  }

  public void setModifie(String modifie) {
    this.modifie = modifie;
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

  public ErmMistakeHandle(long mistakeReviewId, long keyId, long isPass, String content, long returnType, Timestamp handleTime, String handlerCode, String handler, String department, String departmentCode, String compCode, String orgType, String creater, Timestamp createTime, String modifie, Timestamp modifierTime, long isDelete, Timestamp latestTime, double recordVersion) {
    this.mistakeReviewId = mistakeReviewId;
    this.keyId = keyId;
    this.isPass = isPass;
    this.content = content;
    this.returnType = returnType;
    this.handleTime = handleTime;
    this.handlerCode = handlerCode;
    this.handler = handler;
    this.department = department;
    this.departmentCode = departmentCode;
    this.compCode = compCode;
    this.orgType = orgType;
    this.creater = creater;
    this.createTime = createTime;
    this.modifie = modifie;
    this.modifierTime = modifierTime;
    this.isDelete = isDelete;
    this.latestTime = latestTime;
    this.recordVersion = recordVersion;
  }

  public ErmMistakeHandle() {

  }
}
