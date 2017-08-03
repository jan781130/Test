package com.uming.fsm.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FsmCfgVessel generated by hbm2java
 */
@Entity
@Table(name = "FSM_CFG_VESSEL", catalog = "UMDP")
public class FsmCfgVessel implements java.io.Serializable {


  private String no;
  private String nameEn;
  private String nameCh;
  private String email1;
  private String email2;
  private String phoneCountryCode1;
  private String phoneNo1;
  private String phoneCountryCode2;
  private String phoneNo2;
  private String remark;
  private Long fleetId;
  private Long modelNo;
  private Long picFileId1;
  private Long picFileId2;
  private Long particularFileId;
  private Boolean isActive;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCfgVessel() {}


  public FsmCfgVessel(String no) {
    this.no = no;
  }

  public FsmCfgVessel(String no, String nameEn, String nameCh, String email1, String email2,
      String phoneCountryCode1, String phoneNo1, String phoneCountryCode2, String phoneNo2,
      String remark, Long fleetId, Long modelNo, Long picFileId1, Long picFileId2,
      Long particularFileId, Boolean isActive, String createUser, Date createDate,
      String updateUser, Date updateDate) {
    this.no = no;
    this.nameEn = nameEn;
    this.nameCh = nameCh;
    this.email1 = email1;
    this.email2 = email2;
    this.phoneCountryCode1 = phoneCountryCode1;
    this.phoneNo1 = phoneNo1;
    this.phoneCountryCode2 = phoneCountryCode2;
    this.phoneNo2 = phoneNo2;
    this.remark = remark;
    this.fleetId = fleetId;
    this.modelNo = modelNo;
    this.picFileId1 = picFileId1;
    this.picFileId2 = picFileId2;
    this.particularFileId = particularFileId;
    this.isActive = isActive;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateUser = updateUser;
    this.updateDate = updateDate;
  }

  @Id


  @Column(name = "NO", unique = true, nullable = false, length = 20)
  public String getNo() {
    return this.no;
  }

  public void setNo(String no) {
    this.no = no;
  }


  @Column(name = "NAME_EN", length = 50)
  public String getNameEn() {
    return this.nameEn;
  }

  public void setNameEn(String nameEn) {
    this.nameEn = nameEn;
  }


  @Column(name = "NAME_CH", length = 50)
  public String getNameCh() {
    return this.nameCh;
  }

  public void setNameCh(String nameCh) {
    this.nameCh = nameCh;
  }


  @Column(name = "EMAIL_1", length = 200)
  public String getEmail1() {
    return this.email1;
  }

  public void setEmail1(String email1) {
    this.email1 = email1;
  }


  @Column(name = "EMAIL_2", length = 200)
  public String getEmail2() {
    return this.email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }


  @Column(name = "PHONE_COUNTRY_CODE_1", length = 10)
  public String getPhoneCountryCode1() {
    return this.phoneCountryCode1;
  }

  public void setPhoneCountryCode1(String phoneCountryCode1) {
    this.phoneCountryCode1 = phoneCountryCode1;
  }


  @Column(name = "PHONE_NO_1", length = 50)
  public String getPhoneNo1() {
    return this.phoneNo1;
  }

  public void setPhoneNo1(String phoneNo1) {
    this.phoneNo1 = phoneNo1;
  }


  @Column(name = "PHONE_COUNTRY_CODE_2", length = 10)
  public String getPhoneCountryCode2() {
    return this.phoneCountryCode2;
  }

  public void setPhoneCountryCode2(String phoneCountryCode2) {
    this.phoneCountryCode2 = phoneCountryCode2;
  }


  @Column(name = "PHONE_NO_2", length = 50)
  public String getPhoneNo2() {
    return this.phoneNo2;
  }

  public void setPhoneNo2(String phoneNo2) {
    this.phoneNo2 = phoneNo2;
  }


  @Column(name = "REMARK", length = 1000)
  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  @Column(name = "FLEET_ID")
  public Long getFleetId() {
    return this.fleetId;
  }

  public void setFleetId(Long fleetId) {
    this.fleetId = fleetId;
  }


  @Column(name = "MODEL_NO")
  public Long getModelNo() {
    return this.modelNo;
  }

  public void setModelNo(Long modelNo) {
    this.modelNo = modelNo;
  }


  @Column(name = "PIC_FILE_ID_1")
  public Long getPicFileId1() {
    return this.picFileId1;
  }

  public void setPicFileId1(Long picFileId1) {
    this.picFileId1 = picFileId1;
  }


  @Column(name = "PIC_FILE_ID_2")
  public Long getPicFileId2() {
    return this.picFileId2;
  }

  public void setPicFileId2(Long picFileId2) {
    this.picFileId2 = picFileId2;
  }


  @Column(name = "PARTICULAR_FILE_ID")
  public Long getParticularFileId() {
    return this.particularFileId;
  }

  public void setParticularFileId(Long particularFileId) {
    this.particularFileId = particularFileId;
  }


  @Column(name = "IS_ACTIVE")
  public Boolean getIsActive() {
    return this.isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
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


