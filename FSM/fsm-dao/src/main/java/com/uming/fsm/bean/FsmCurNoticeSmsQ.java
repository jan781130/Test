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
 * FsmCurNoticeSmsQ generated by hbm2java
 */
@Entity
@Table(name = "FSM_CUR_NOTICE_SMS_Q", catalog = "UMDP")
public class FsmCurNoticeSmsQ implements java.io.Serializable {


  private String id;
  private String noticeEventCd;
  private String subject;
  private String content;
  private String var;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCurNoticeSmsQ() {}


  public FsmCurNoticeSmsQ(String id) {
    this.id = id;
  }

  public FsmCurNoticeSmsQ(String id, String noticeEventCd, String subject, String content,
      String var, String createUser, Date createDate, String updateUser, Date updateDate) {
    this.id = id;
    this.noticeEventCd = noticeEventCd;
    this.subject = subject;
    this.content = content;
    this.var = var;
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


  @Column(name = "NOTICE_EVENT_CD", length = 100)
  public String getNoticeEventCd() {
    return this.noticeEventCd;
  }

  public void setNoticeEventCd(String noticeEventCd) {
    this.noticeEventCd = noticeEventCd;
  }


  @Column(name = "SUBJECT", length = 200)
  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Column(name = "CONTENT", length = 1000)
  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Column(name = "VAR", length = 1000)
  public String getVar() {
    return this.var;
  }

  public void setVar(String var) {
    this.var = var;
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


