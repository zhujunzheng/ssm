package com.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * 差错处理表
 */
public class ErmMistakeDispose {

  private long mistakeDisposeId;
  private String mistakeCode;
  private long disposeType;
  private String disposeResult;
  private String disposeAccord;
  private java.sql.Timestamp disposeTime;
  private long dutyCategory;
  private long dutyYpe;
  private long isTenable;
  private long untenableReason;
  private String disposeDepartment;
  private String disposeDepartmentCode;
  private String disposer;
  private String disposerCode;
  private double returnMoney;
  private String compCode;
  private String orgType;
  private String creater;
  private java.sql.Timestamp createTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp latestTime;
  private double recordVersion;

  private Set<ErmMistakeDisposeDetail> ermMistakeDisposeDetails;

  public Set<ErmMistakeDisposeDetail> getErmMistakeDisposeDetails() {
    return ermMistakeDisposeDetails;
  }

  public void setErmMistakeDisposeDetails(Set<ErmMistakeDisposeDetail> ermMistakeDisposeDetails) {
    this.ermMistakeDisposeDetails = ermMistakeDisposeDetails;
  }

  public long getMistakeDisposeId() {
    return mistakeDisposeId;
  }

  public void setMistakeDisposeId(long mistakeDisposeId) {
    this.mistakeDisposeId = mistakeDisposeId;
  }


  public String getMistakeCode() {
    return mistakeCode;
  }

  public void setMistakeCode(String mistakeCode) {
    this.mistakeCode = mistakeCode;
  }


  public long getDisposeType() {
    return disposeType;
  }

  public void setDisposeType(long disposeType) {
    this.disposeType = disposeType;
  }


  public String getDisposeResult() {
    return disposeResult;
  }

  public void setDisposeResult(String disposeResult) {
    this.disposeResult = disposeResult;
  }


  public String getDisposeAccord() {
    return disposeAccord;
  }

  public void setDisposeAccord(String disposeAccord) {
    this.disposeAccord = disposeAccord;
  }


  public java.sql.Timestamp getDisposeTime() {
    return disposeTime;
  }

  public void setDisposeTime(java.sql.Timestamp disposeTime) {
    this.disposeTime = disposeTime;
  }


  public long getDutyCategory() {
    return dutyCategory;
  }

  public void setDutyCategory(long dutyCategory) {
    this.dutyCategory = dutyCategory;
  }


  public long getDutyYpe() {
    return dutyYpe;
  }

  public void setDutyYpe(long dutyYpe) {
    this.dutyYpe = dutyYpe;
  }


  public long getIsTenable() {
    return isTenable;
  }

  public void setIsTenable(long isTenable) {
    this.isTenable = isTenable;
  }


  public long getUntenableReason() {
    return untenableReason;
  }

  public void setUntenableReason(long untenableReason) {
    this.untenableReason = untenableReason;
  }


  public String getDisposeDepartment() {
    return disposeDepartment;
  }

  public void setDisposeDepartment(String disposeDepartment) {
    this.disposeDepartment = disposeDepartment;
  }


  public String getDisposeDepartmentCode() {
    return disposeDepartmentCode;
  }

  public void setDisposeDepartmentCode(String disposeDepartmentCode) {
    this.disposeDepartmentCode = disposeDepartmentCode;
  }


  public String getDisposer() {
    return disposer;
  }

  public void setDisposer(String disposer) {
    this.disposer = disposer;
  }


  public String getDisposerCode() {
    return disposerCode;
  }

  public void setDisposerCode(String disposerCode) {
    this.disposerCode = disposerCode;
  }


  public double getReturnMoney() {
    return returnMoney;
  }

  public void setReturnMoney(double returnMoney) {
    this.returnMoney = returnMoney;
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

  public ErmMistakeDispose(long mistakeDisposeId, String mistakeCode, long disposeType, String disposeResult, String disposeAccord, Timestamp disposeTime, long dutyCategory, long dutyYpe, long isTenable, long untenableReason, String disposeDepartment, String disposeDepartmentCode, String disposer, String disposerCode, double returnMoney, String compCode, String orgType, String creater, Timestamp createTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp latestTime, double recordVersion, Set<ErmMistakeDisposeDetail> ermMistakeDisposeDetails) {
    this.mistakeDisposeId = mistakeDisposeId;
    this.mistakeCode = mistakeCode;
    this.disposeType = disposeType;
    this.disposeResult = disposeResult;
    this.disposeAccord = disposeAccord;
    this.disposeTime = disposeTime;
    this.dutyCategory = dutyCategory;
    this.dutyYpe = dutyYpe;
    this.isTenable = isTenable;
    this.untenableReason = untenableReason;
    this.disposeDepartment = disposeDepartment;
    this.disposeDepartmentCode = disposeDepartmentCode;
    this.disposer = disposer;
    this.disposerCode = disposerCode;
    this.returnMoney = returnMoney;
    this.compCode = compCode;
    this.orgType = orgType;
    this.creater = creater;
    this.createTime = createTime;
    this.modifier = modifier;
    this.modifierTime = modifierTime;
    this.isDelete = isDelete;
    this.latestTime = latestTime;
    this.recordVersion = recordVersion;
    this.ermMistakeDisposeDetails = ermMistakeDisposeDetails;
  }

  public ErmMistakeDispose() {
  }
}
