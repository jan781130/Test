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
 * FsmCfgFleet generated by hbm2java
 */
@Entity
@Table(name = "FSM_CFG_FLEET", catalog = "UMDP")
public class FsmCfgFleet implements java.io.Serializable {


  private long id;
  private String name;
  private String color;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCfgFleet() {}


  public FsmCfgFleet(long id) {
    this.id = id;
  }

  public FsmCfgFleet(long id, String name, String color, String createUser, Date createDate,
      String updateUser, Date updateDate) {
    this.id = id;
    this.name = name;
    this.color = color;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateUser = updateUser;
    this.updateDate = updateDate;
  }

  @Id


  @Column(name = "ID", unique = true, nullable = false)
  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }


  @Column(name = "NAME", length = 50)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Column(name = "COLOR", length = 20)
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
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


