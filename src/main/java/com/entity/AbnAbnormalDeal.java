package com.entity;

import java.sql.Timestamp;

/**
 * 问题件回复表
 */

public class AbnAbnormalDeal {

  private long abnormalDealId;
  private String abnormalCode;
  private String dealEmpCode;
  private String dealEmpName;
  private String dealContent;
  private java.sql.Timestamp dealTime;
  private long creater;
  private java.sql.Timestamp createrTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp lastTime;
  private double recordVersion;
  private String orgType;
  private String compCode;


  public long getAbnormalDealId() {
    return abnormalDealId;
  }

  public void setAbnormalDealId(long abnormalDealId) {
    this.abnormalDealId = abnormalDealId;
  }


  public String getAbnormalCode() {
    return abnormalCode;
  }

  public void setAbnormalCode(String abnormalCode) {
    this.abnormalCode = abnormalCode;
  }


  public String getDealEmpCode() {
    return dealEmpCode;
  }

  public void setDealEmpCode(String dealEmpCode) {
    this.dealEmpCode = dealEmpCode;
  }


  public String getDealEmpName() {
    return dealEmpName;
  }

  public void setDealEmpName(String dealEmpName) {
    this.dealEmpName = dealEmpName;
  }


  public String getDealContent() {
    return dealContent;
  }

  public void setDealContent(String dealContent) {
    this.dealContent = dealContent;
  }


  public java.sql.Timestamp getDealTime() {
    return dealTime;
  }

  public void setDealTime(java.sql.Timestamp dealTime) {
    this.dealTime = dealTime;
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


  public AbnAbnormalDeal(long abnormalDealId, String abnormalCode, String dealEmpCode, String dealEmpName, String dealContent, Timestamp dealTime, long creater, Timestamp createrTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp lastTime, double recordVersion, String orgType, String compCode) {
    this.abnormalDealId = abnormalDealId;
    this.abnormalCode = abnormalCode;
    this.dealEmpCode = dealEmpCode;
    this.dealEmpName = dealEmpName;
    this.dealContent = dealContent;
    this.dealTime = dealTime;
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

  public AbnAbnormalDeal() {
  }
}
