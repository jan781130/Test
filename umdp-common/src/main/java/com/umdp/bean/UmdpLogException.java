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
 * UmdpLogException generated by hbm2java
 */
@Entity
@Table(name = "UMDP_LOG_EXCEPTION", catalog = "UMDP")
public class UmdpLogException implements java.io.Serializable {


  private long id;
  private String funcName;
  private byte[] trace;
  private String message;
  private String createUser;
  private Date createDate;

  public UmdpLogException() {}


  public UmdpLogException(long id) {
    this.id = id;
  }

  public UmdpLogException(long id, String funcName, byte[] trace, String message, String createUser,
      Date createDate) {
    this.id = id;
    this.funcName = funcName;
    this.trace = trace;
    this.message = message;
    this.createUser = createUser;
    this.createDate = createDate;
  }

  @Id


  @Column(name = "ID", unique = true, nullable = false)
  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }


  @Column(name = "FUNC_NAME", length = 1000)
  public String getFuncName() {
    return this.funcName;
  }

  public void setFuncName(String funcName) {
    this.funcName = funcName;
  }


  @Column(name = "TRACE")
  public byte[] getTrace() {
    return this.trace;
  }

  public void setTrace(byte[] trace) {
    this.trace = trace;
  }


  @Column(name = "MESSAGE", length = 1000)
  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
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


