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
 * FsmCurVesselEqpStatus generated by hbm2java
 */
@Entity
@Table(name = "FSM_CUR_VESSEL_EQP_STATUS", catalog = "UMDP")
public class FsmCurVesselEqpStatus implements java.io.Serializable {


  private long eqpId;
  private Boolean isAlarm;
  private String memo;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCurVesselEqpStatus() {}


  public FsmCurVesselEqpStatus(long eqpId) {
    this.eqpId = eqpId;
  }

  public FsmCurVesselEqpStatus(long eqpId, Boolean isAlarm, String memo, String createUser,
      Date createDate, String updateUser, Date updateDate) {
    this.eqpId = eqpId;
    this.isAlarm = isAlarm;
    this.memo = memo;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateUser = updateUser;
    this.updateDate = updateDate;
  }

  @Id


  @Column(name = "EQP_ID", unique = true, nullable = false)
  public long getEqpId() {
    return this.eqpId;
  }

  public void setEqpId(long eqpId) {
    this.eqpId = eqpId;
  }


  @Column(name = "IS_ALARM")
  public Boolean getIsAlarm() {
    return this.isAlarm;
  }

  public void setIsAlarm(Boolean isAlarm) {
    this.isAlarm = isAlarm;
  }


  @Column(name = "MEMO", length = 1000)
  public String getMemo() {
    return this.memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
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


