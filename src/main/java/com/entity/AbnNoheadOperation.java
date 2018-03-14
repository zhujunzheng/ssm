package com.entity;

import java.sql.Timestamp;

/**
 * 无头件操作表
 */

public class AbnNoheadOperation {

  private long noheadOperationId;
  private String noheadCode;
  private long operationType;
  private String empCode;
  private String empName;
  private String departCode;
  private String departName;
  private String waybillCode;
  private String childWaybillCode;
  private String content;
  private long checkStatus;
  private java.sql.Timestamp operationTime;
  private long creater;
  private java.sql.Timestamp createrTime;
  private String modifier;
  private java.sql.Timestamp modifierTime;
  private long isDelete;
  private java.sql.Timestamp lastTime;
  private double recordVersion;
  private String compCode;


  public long getNoheadOperationId() {
    return noheadOperationId;
  }

  public void setNoheadOperationId(long noheadOperationId) {
    this.noheadOperationId = noheadOperationId;
  }


  public String getNoheadCode() {
    return noheadCode;
  }

  public void setNoheadCode(String noheadCode) {
    this.noheadCode = noheadCode;
  }


  public long getOperationType() {
    return operationType;
  }

  public void setOperationType(long operationType) {
    this.operationType = operationType;
  }


  public String getEmpCode() {
    return empCode;
  }

  public void setEmpCode(String empCode) {
    this.empCode = empCode;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getDepartCode() {
    return departCode;
  }

  public void setDepartCode(String departCode) {
    this.departCode = departCode;
  }


  public String getDepartName() {
    return departName;
  }

  public void setDepartName(String departName) {
    this.departName = departName;
  }


  public String getWaybillCode() {
    return waybillCode;
  }

  public void setWaybillCode(String waybillCode) {
    this.waybillCode = waybillCode;
  }


  public String getChildWaybillCode() {
    return childWaybillCode;
  }

  public void setChildWaybillCode(String childWaybillCode) {
    this.childWaybillCode = childWaybillCode;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getCheckStatus() {
    return checkStatus;
  }

  public void setCheckStatus(long checkStatus) {
    this.checkStatus = checkStatus;
  }


  public java.sql.Timestamp getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(java.sql.Timestamp operationTime) {
    this.operationTime = operationTime;
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


  public String getCompCode() {
    return compCode;
  }

  public void setCompCode(String compCode) {
    this.compCode = compCode;
  }

  public AbnNoheadOperation(long noheadOperationId, String noheadCode, long operationType, String empCode, String empName, String departCode, String departName, String waybillCode, String childWaybillCode, String content, long checkStatus, Timestamp operationTime, long creater, Timestamp createrTime, String modifier, Timestamp modifierTime, long isDelete, Timestamp lastTime, double recordVersion, String compCode) {
    this.noheadOperationId = noheadOperationId;
    this.noheadCode = noheadCode;
    this.operationType = operationType;
    this.empCode = empCode;
    this.empName = empName;
    this.departCode = departCode;
    this.departName = departName;
    this.waybillCode = waybillCode;
    this.childWaybillCode = childWaybillCode;
    this.content = content;
    this.checkStatus = checkStatus;
    this.operationTime = operationTime;
    this.creater = creater;
    this.createrTime = createrTime;
    this.modifier = modifier;
    this.modifierTime = modifierTime;
    this.isDelete = isDelete;
    this.lastTime = lastTime;
    this.recordVersion = recordVersion;
    this.compCode = compCode;
  }

  public AbnNoheadOperation() {
  }
}
