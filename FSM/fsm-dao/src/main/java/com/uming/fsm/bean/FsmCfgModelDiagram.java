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
 * FsmCfgModelDiagram generated by hbm2java
 */
@Entity
@Table(name = "FSM_CFG_MODEL_DIAGRAM", catalog = "UMDP")
public class FsmCfgModelDiagram implements java.io.Serializable {


  private long id;
  private String name;
  private String dsc;
  private String eqpCateCd;
  private Long fileId;
  private Long modelNo;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCfgModelDiagram() {}


  public FsmCfgModelDiagram(long id) {
    this.id = id;
  }

  public FsmCfgModelDiagram(long id, String name, String dsc, String eqpCateCd, Long fileId,
      Long modelNo, String createUser, Date createDate, String updateUser, Date updateDate) {
    this.id = id;
    this.name = name;
    this.dsc = dsc;
    this.eqpCateCd = eqpCateCd;
    this.fileId = fileId;
    this.modelNo = modelNo;
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


  @Column(name = "NAME", length = 200)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Column(name = "DSC", length = 1000)
  public String getDsc() {
    return this.dsc;
  }

  public void setDsc(String dsc) {
    this.dsc = dsc;
  }


  @Column(name = "EQP_CATE_CD", length = 100)
  public String getEqpCateCd() {
    return this.eqpCateCd;
  }

  public void setEqpCateCd(String eqpCateCd) {
    this.eqpCateCd = eqpCateCd;
  }


  @Column(name = "FILE_ID")
  public Long getFileId() {
    return this.fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }


  @Column(name = "MODEL_NO")
  public Long getModelNo() {
    return this.modelNo;
  }

  public void setModelNo(Long modelNo) {
    this.modelNo = modelNo;
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


