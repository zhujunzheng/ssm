package com.entity;

import java.sql.Timestamp;

/**
 * 无头件表
 */

public class AbnNohead {

  private long noheadId;
  private String noheadCode;
  private String reportDepartCode;
  private String reportDepartName;
  private String reportProvinceCode;
  private String reportProvinceName;
  private String reportEmpCode;
  private String reportEmpName;
  private java.sql.Timestamp reportDate;
  private long packType;
  private String mailCarrier;
  private long num;
  private double volume;
  private double weight;
  private String parentDepartCode;
  private String parentDepartName;
  private long businessType;
  private String detail;
  private long creater;
  private java.sql.Timestamp createrTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp lastTime;
  private double recordVersion;
  private String orgType;
  private String compCode;


  public long getNoheadId() {
    return noheadId;
  }

  public void setNoheadId(long noheadId) {
    this.noheadId = noheadId;
  }


  public String getNoheadCode() {
    return noheadCode;
  }

  public void setNoheadCode(String noheadCode) {
    this.noheadCode = noheadCode;
  }


  public String getReportDepartCode() {
    return reportDepartCode;
  }

  public void setReportDepartCode(String reportDepartCode) {
    this.reportDepartCode = reportDepartCode;
  }


  public String getReportDepartName() {
    return reportDepartName;
  }

  public void setReportDepartName(String reportDepartName) {
    this.reportDepartName = reportDepartName;
  }


  public String getReportProvinceCode() {
    return reportProvinceCode;
  }

  public void setReportProvinceCode(String reportProvinceCode) {
    this.reportProvinceCode = reportProvinceCode;
  }


  public String getReportProvinceName() {
    return reportProvinceName;
  }

  public void setReportProvinceName(String reportProvinceName) {
    this.reportProvinceName = reportProvinceName;
  }


  public String getReportEmpCode() {
    return reportEmpCode;
  }

  public void setReportEmpCode(String reportEmpCode) {
    this.reportEmpCode = reportEmpCode;
  }


  public String getReportEmpName() {
    return reportEmpName;
  }

  public void setReportEmpName(String reportEmpName) {
    this.reportEmpName = reportEmpName;
  }


  public java.sql.Timestamp getReportDate() {
    return reportDate;
  }

  public void setReportDate(java.sql.Timestamp reportDate) {
    this.reportDate = reportDate;
  }


  public long getPackType() {
    return packType;
  }

  public void setPackType(long packType) {
    this.packType = packType;
  }


  public String getMailCarrier() {
    return mailCarrier;
  }

  public void setMailCarrier(String mailCarrier) {
    this.mailCarrier = mailCarrier;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public String getParentDepartCode() {
    return parentDepartCode;
  }

  public void setParentDepartCode(String parentDepartCode) {
    this.parentDepartCode = parentDepartCode;
  }


  public String getParentDepartName() {
    return parentDepartName;
  }

  public void setParentDepartName(String parentDepartName) {
    this.parentDepartName = parentDepartName;
  }


  public long getBusinessType() {
    return businessType;
  }

  public void setBusinessType(long businessType) {
    this.businessType = businessType;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public long getCreater() {
    return creater;
  }

  public void setCreater(long creater) {
    this.creater = creater;
  }


  public java.sql.Timestamp getCreaterTime() {
    return createrTime;
  }

  public void setCreaterTime(java.sql.Timestamp createrTime) {
    this.createrTime = createrTime;
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


  public java.sql.Timestamp getLastTime() {
    return lastTime;
  }

  public void setLastTime(java.sql.Timestamp lastTime) {
    this.lastTime = lastTime;
  }


  public double getRecordVersion() {
    return recordVersion;
  }

  public void setRecordVersion(double recordVersion) {
    this.recordVersion = recordVersion;
  }


  public String getOrgType() {
    return orgType;
  }

  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }


  public String getCompCode() {
    return compCode;
  }

  public void setCompCode(String compCode) {
    this.compCode = compCode;
  }

  public AbnNohead(long noheadId, String noheadCode, String reportDepartCode, String reportDepartName, String reportProvinceCode, String reportProvinceName, String reportEmpCode, String reportEmpName, Timestamp reportDate, long packType, String mailCarrier, long num, double volume, double weight, String parentDepartCode, String parentDepartName, long businessType, String detail, long creater, Timestamp createrTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp lastTime, double recordVersion, String orgType, String compCode) {
    this.noheadId = noheadId;
    this.noheadCode = noheadCode;
    this.reportDepartCode = reportDepartCode;
    this.reportDepartName = reportDepartName;
    this.reportProvinceCode = reportProvinceCode;
    this.reportProvinceName = reportProvinceName;
    this.reportEmpCode = reportEmpCode;
    this.reportEmpName = reportEmpName;
    this.reportDate = reportDate;
    this.packType = packType;
    this.mailCarrier = mailCarrier;
    this.num = num;
    this.volume = volume;
    this.weight = weight;
    this.parentDepartCode = parentDepartCode;
    this.parentDepartName = parentDepartName;
    this.businessType = businessType;
    this.detail = detail;
    this.creater = creater;
    this.createrTime = createrTime;
    this.modifier = modifier;
    this.modifierTime = modifierTime;
    this.isDelete = isDelete;
    this.lastTime = lastTime;
    this.recordVersion = recordVersion;
    this.orgType = orgType;
    this.compCode = compCode;
  }

  public AbnNohead() {
  }
}
