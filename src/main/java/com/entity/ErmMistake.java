package com.entity;

import java.sql.Timestamp;

/**
 * 差错表
 */

public class ErmMistake {

  private long mistake_id;
  private String accept_time;
  private String report_department_code;
  private String report_department;
  private String report_company_code;
  private String report_company;
  private String report_province_code;
  private String report_province;
  private String report_content;
  private String report_time;
  private long dispose_status;
  private long question_quantity;
  private long quantity;
  private double weight;
  private String goods_name;
  private long package_type;
  private long service_type;
  private long sign_type;
  private String waybill_no;
  private String abnormal_code;
  private long type;
  private String code;
  private String comp_code;
  private String org_type;
  private String creater;
  private String create_time;
  private String modifier;
  private String modifier_time;
  private long is_delete;
  private String latest_time;
  private double record_version;

  public long getMistake_id() {
    return mistake_id;
  }

  public void setMistake_id(long mistake_id) {
    this.mistake_id = mistake_id;
  }

  public String getAccept_time() {
    return accept_time;
  }

  public void setAccept_time(String accept_time) {
    this.accept_time = accept_time;
  }

  public String getReport_department_code() {
    return report_department_code;
  }

  public void setReport_department_code(String report_department_code) {
    this.report_department_code = report_department_code;
  }

  public String getReport_department() {
    return report_department;
  }

  public void setReport_department(String report_department) {
    this.report_department = report_department;
  }

  public String getReport_company_code() {
    return report_company_code;
  }

  public void setReport_company_code(String report_company_code) {
    this.report_company_code = report_company_code;
  }

  public String getReport_company() {
    return report_company;
  }

  public void setReport_company(String report_company) {
    this.report_company = report_company;
  }

  public String getReport_province_code() {
    return report_province_code;
  }

  public void setReport_province_code(String report_province_code) {
    this.report_province_code = report_province_code;
  }

  public String getReport_province() {
    return report_province;
  }

  public void setReport_province(String report_province) {
    this.report_province = report_province;
  }

  public String getReport_content() {
    return report_content;
  }

  public void setReport_content(String report_content) {
    this.report_content = report_content;
  }

  public String getReport_time() {
    return report_time;
  }

  public void setReport_time(String report_time) {
    this.report_time = report_time;
  }

  public long getDispose_status() {
    return dispose_status;
  }

  public void setDispose_status(long dispose_status) {
    this.dispose_status = dispose_status;
  }

  public long getQuestion_quantity() {
    return question_quantity;
  }

  public void setQuestion_quantity(long question_quantity) {
    this.question_quantity = question_quantity;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getGoods_name() {
    return goods_name;
  }

  public void setGoods_name(String goods_name) {
    this.goods_name = goods_name;
  }

  public long getPackage_type() {
    return package_type;
  }

  public void setPackage_type(long package_type) {
    this.package_type = package_type;
  }

  public long getService_type() {
    return service_type;
  }

  public void setService_type(long service_type) {
    this.service_type = service_type;
  }

  public long getSign_type() {
    return sign_type;
  }

  public void setSign_type(long sign_type) {
    this.sign_type = sign_type;
  }

  public String getWaybill_no() {
    return waybill_no;
  }

  public void setWaybill_no(String waybill_no) {
    this.waybill_no = waybill_no;
  }

  public String getAbnormal_code() {
    return abnormal_code;
  }

  public void setAbnormal_code(String abnormal_code) {
    this.abnormal_code = abnormal_code;
  }

  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getComp_code() {
    return comp_code;
  }

  public void setComp_code(String comp_code) {
    this.comp_code = comp_code;
  }

  public String getOrg_type() {
    return org_type;
  }

  public void setOrg_type(String org_type) {
    this.org_type = org_type;
  }

  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }

  public String getCreate_time() {
    return create_time;
  }

  public void setCreate_time(String create_time) {
    this.create_time = create_time;
  }

  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public String getModifier_time() {
    return modifier_time;
  }

  public void setModifier_time(String modifier_time) {
    this.modifier_time = modifier_time;
  }

  public long getIs_delete() {
    return is_delete;
  }

  public void setIs_delete(long is_delete) {
    this.is_delete = is_delete;
  }

  public String getLatest_time() {
    return latest_time;
  }

  public void setLatest_time(String latest_time) {
    this.latest_time = latest_time;
  }

  public double getRecord_version() {
    return record_version;
  }

  public void setRecord_version(double record_version) {
    this.record_version = record_version;
  }

  public ErmMistake(long mistake_id, String accept_time, String report_department_code, String report_department, String report_company_code, String report_company, String report_province_code, String report_province, String report_content, String report_time, long dispose_status, long question_quantity, long quantity, double weight, String goods_name, long package_type, long service_type, long sign_type, String waybill_no, String abnormal_code, long type, String code, String comp_code, String org_type, String creater, String create_time, String modifier, String modifier_time, long is_delete, String latest_time, double record_version) {
    this.mistake_id = mistake_id;
    this.accept_time = accept_time;
    this.report_department_code = report_department_code;
    this.report_department = report_department;
    this.report_company_code = report_company_code;
    this.report_company = report_company;
    this.report_province_code = report_province_code;
    this.report_province = report_province;
    this.report_content = report_content;
    this.report_time = report_time;
    this.dispose_status = dispose_status;
    this.question_quantity = question_quantity;
    this.quantity = quantity;
    this.weight = weight;
    this.goods_name = goods_name;
    this.package_type = package_type;
    this.service_type = service_type;
    this.sign_type = sign_type;
    this.waybill_no = waybill_no;
    this.abnormal_code = abnormal_code;
    this.type = type;
    this.code = code;
    this.comp_code = comp_code;
    this.org_type = org_type;
    this.creater = creater;
    this.create_time = create_time;
    this.modifier = modifier;
    this.modifier_time = modifier_time;
    this.is_delete = is_delete;
    this.latest_time = latest_time;
    this.record_version = record_version;
  }

  public ErmMistake() {
  }
}
