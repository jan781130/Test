package com.umdp.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UmdpCfgNoticeTarget generated by hbm2java
 */
@Entity
@Table(name = "UMDP_CFG_NOTICE_TARGET", catalog = "UMDP")
public class UmdpCfgNoticeTarget implements java.io.Serializable {


  private UmdpCfgNoticeTargetId id;
  private Boolean isGrp;
  private String createUser;
  private Date createDate;

  public UmdpCfgNoticeTarget() {}


  public UmdpCfgNoticeTarget(UmdpCfgNoticeTargetId id) {
    this.id = id;
  }

  public UmdpCfgNoticeTarget(UmdpCfgNoticeTargetId id, Boolean isGrp, String createUser,
      Date createDate) {
    this.id = id;
    this.isGrp = isGrp;
    this.createUser = createUser;
    this.createDate = createDate;
  }

  @EmbeddedId


  @AttributeOverrides({
      @AttributeOverride(name = "noticeEventCd",
          column = @Column(name = "NOTICE_EVENT_CD", nullable = false, length = 100)),
      @AttributeOverride(name = "noticeTarget",
          column = @Column(name = "NOTICE_TARGET", nullable = false, length = 100))})
  public UmdpCfgNoticeTargetId getId() {
    return this.id;
  }

  public void setId(UmdpCfgNoticeTargetId id) {
    this.id = id;
  }


  @Column(name = "IS_GRP")
  public Boolean getIsGrp() {
    return this.isGrp;
  }

  public void setIsGrp(Boolean isGrp) {
    this.isGrp = isGrp;
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



}


