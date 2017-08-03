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
 * UmdpCurNoticeEmailQ generated by hbm2java
 */
@Entity
@Table(name = "UMDP_CUR_NOTICE_EMAIL_Q", catalog = "UMDP")
public class UmdpCurNoticeEmailQ implements java.io.Serializable {


  private long id;
  private String noticeEventCd;
  private String subject;
  private String content;
  private String var;
  private String sendId;
  private Date sendDate;
  private Date recvDate;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public UmdpCurNoticeEmailQ() {}


  public UmdpCurNoticeEmailQ(long id) {
    this.id = id;
  }

  public UmdpCurNoticeEmailQ(long id, String noticeEventCd, String subject, String content,
      String var, String sendId, Date sendDate, Date recvDate, String createUser, Date createDate,
      String updateUser, Date updateDate) {
    this.id = id;
    this.noticeEventCd = noticeEventCd;
    this.subject = subject;
    this.content = content;
    this.var = var;
    this.sendId = sendId;
    this.sendDate = sendDate;
    this.recvDate = recvDate;
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


  @Column(name = "SEND_ID", length = 50)
  public String getSendId() {
    return this.sendId;
  }

  public void setSendId(String sendId) {
    this.sendId = sendId;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "SEND_DATE", length = 26)
  public Date getSendDate() {
    return this.sendDate;
  }

  public void setSendDate(Date sendDate) {
    this.sendDate = sendDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "RECV_DATE", length = 26)
  public Date getRecvDate() {
    return this.recvDate;
  }

  public void setRecvDate(Date recvDate) {
    this.recvDate = recvDate;
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


