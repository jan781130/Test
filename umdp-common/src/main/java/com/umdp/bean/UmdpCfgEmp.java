package com.umdp.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UmdpCfgEmp generated by hbm2java
 */
@Entity
@Table(name = "UMDP_CFG_EMP", catalog = "UMDP")
public class UmdpCfgEmp implements java.io.Serializable {


  private String id;
  private String deptId;
  private String empName;
  private String empFName;
  private String empLName;
  private String engName;
  private String engFName;
  private String engLName;
  private String displayName;
  private String ntAccount;
  private String email;
  private String mobile;
  private String extension;
  private String title;
  private String titleName;
  private String titleClass;
  private String compCode;
  private String compName;
  private String busnsCode;
  private String busnsName;
  private String region;
  private String regionName;
  private String costCenter;
  private String locationCode;
  private String locationName;
  private Date entDate;
  private Date offDate;
  private Date finalDate;
  private String empType;
  private String opId;
  private String loginId;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public UmdpCfgEmp() {}


  public UmdpCfgEmp(String id) {
    this.id = id;
  }

  public UmdpCfgEmp(String id, String deptId, String empName, String empFName, String empLName,
      String engName, String engFName, String engLName, String displayName, String ntAccount,
      String email, String mobile, String extension, String title, String titleName,
      String titleClass, String compCode, String compName, String busnsCode, String busnsName,
      String region, String regionName, String costCenter, String locationCode, String locationName,
      Date entDate, Date offDate, Date finalDate, String empType, String opId, String loginId,
      String createUser, Date createDate, String updateUser, Date updateDate) {
    this.id = id;
    this.deptId = deptId;
    this.empName = empName;
    this.empFName = empFName;
    this.empLName = empLName;
    this.engName = engName;
    this.engFName = engFName;
    this.engLName = engLName;
    this.displayName = displayName;
    this.ntAccount = ntAccount;
    this.email = email;
    this.mobile = mobile;
    this.extension = extension;
    this.title = title;
    this.titleName = titleName;
    this.titleClass = titleClass;
    this.compCode = compCode;
    this.compName = compName;
    this.busnsCode = busnsCode;
    this.busnsName = busnsName;
    this.region = region;
    this.regionName = regionName;
    this.costCenter = costCenter;
    this.locationCode = locationCode;
    this.locationName = locationName;
    this.entDate = entDate;
    this.offDate = offDate;
    this.finalDate = finalDate;
    this.empType = empType;
    this.opId = opId;
    this.loginId = loginId;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateUser = updateUser;
    this.updateDate = updateDate;
  }

  @Id


  @Column(name = "ID", unique = true, nullable = false, length = 50)
  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Column(name = "DEPT_ID", length = 100)
  public String getDeptId() {
    return this.deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }


  @Column(name = "EMP_NAME", length = 200)
  public String getEmpName() {
    return this.empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  @Column(name = "EMP_F_NAME", length = 200)
  public String getEmpFName() {
    return this.empFName;
  }

  public void setEmpFName(String empFName) {
    this.empFName = empFName;
  }


  @Column(name = "EMP_L_NAME", length = 200)
  public String getEmpLName() {
    return this.empLName;
  }

  public void setEmpLName(String empLName) {
    this.empLName = empLName;
  }


  @Column(name = "ENG_NAME", length = 200)
  public String getEngName() {
    return this.engName;
  }

  public void setEngName(String engName) {
    this.engName = engName;
  }


  @Column(name = "ENG_F_NAME", length = 200)
  public String getEngFName() {
    return this.engFName;
  }

  public void setEngFName(String engFName) {
    this.engFName = engFName;
  }


  @Column(name = "ENG_L_NAME", length = 200)
  public String getEngLName() {
    return this.engLName;
  }

  public void setEngLName(String engLName) {
    this.engLName = engLName;
  }


  @Column(name = "DISPLAY_NAME", length = 500)
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Column(name = "NT_ACCOUNT", length = 50)
  public String getNtAccount() {
    return this.ntAccount;
  }

  public void setNtAccount(String ntAccount) {
    this.ntAccount = ntAccount;
  }


  @Column(name = "EMAIL", length = 200)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Column(name = "MOBILE", length = 50)
  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  @Column(name = "EXTENSION", length = 50)
  public String getExtension() {
    return this.extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Column(name = "TITLE", length = 20)
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Column(name = "TITLE_NAME", length = 100)
  public String getTitleName() {
    return this.titleName;
  }

  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }


  @Column(name = "TITLE_CLASS", length = 20)
  public String getTitleClass() {
    return this.titleClass;
  }

  public void setTitleClass(String titleClass) {
    this.titleClass = titleClass;
  }


  @Column(name = "COMP_CODE", length = 20)
  public String getCompCode() {
    return this.compCode;
  }

  public void setCompCode(String compCode) {
    this.compCode = compCode;
  }


  @Column(name = "COMP_NAME", length = 100)
  public String getCompName() {
    return this.compName;
  }

  public void setCompName(String compName) {
    this.compName = compName;
  }


  @Column(name = "BUSNS_CODE", length = 100)
  public String getBusnsCode() {
    return this.busnsCode;
  }

  public void setBusnsCode(String busnsCode) {
    this.busnsCode = busnsCode;
  }


  @Column(name = "BUSNS_NAME", length = 100)
  public String getBusnsName() {
    return this.busnsName;
  }

  public void setBusnsName(String busnsName) {
    this.busnsName = busnsName;
  }


  @Column(name = "REGION", length = 20)
  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Column(name = "REGION_NAME", length = 100)
  public String getRegionName() {
    return this.regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  @Column(name = "COST_CENTER", length = 100)
  public String getCostCenter() {
    return this.costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }


  @Column(name = "LOCATION_CODE", length = 100)
  public String getLocationCode() {
    return this.locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  @Column(name = "LOCATION_NAME", length = 100)
  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ENT_DATE", length = 26)
  public Date getEntDate() {
    return this.entDate;
  }

  public void setEntDate(Date entDate) {
    this.entDate = entDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OFF_DATE", length = 26)
  public Date getOffDate() {
    return this.offDate;
  }

  public void setOffDate(Date offDate) {
    this.offDate = offDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "FINAL_DATE", length = 26)
  public Date getFinalDate() {
    return this.finalDate;
  }

  public void setFinalDate(Date finalDate) {
    this.finalDate = finalDate;
  }


  @Column(name = "EMP_TYPE", length = 10)
  public String getEmpType() {
    return this.empType;
  }

  public void setEmpType(String empType) {
    this.empType = empType;
  }


  @Column(name = "OP_ID", length = 10)
  public String getOpId() {
    return this.opId;
  }

  public void setOpId(String opId) {
    this.opId = opId;
  }


  @Column(name = "LOGIN_ID", length = 10)
  public String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  @Column(name = "CREATE_USER", length = 50)
  public String getCreateUser() {
    return this.createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CREATE_DATE", length = 26)
  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  @Column(name = "UPDATE_USER", length = 50)
  public String getUpdateUser() {
    return this.updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "UPDATE_DATE", length = 26)
  public Date getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }



}


