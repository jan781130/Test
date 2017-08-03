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
 * UmdpLogLogin generated by hbm2java
 */
@Entity
@Table(name = "UMDP_LOG_LOGIN", catalog = "UMDP")
public class UmdpLogLogin implements java.io.Serializable {


  private long id;
  private String empId;
  private String ntAccount;
  private String loginIp;
  private Date loginDate;
  private Boolean loginStatus;
  private String accessPath;
  private String message;
  private String createUser;
  private Date createDate;

  public UmdpLogLogin() {}


  public UmdpLogLogin(long id) {
    this.id = id;
  }

  public UmdpLogLogin(long id, String empId, String ntAccount, String loginIp, Date loginDate,
      Boolean loginStatus, String accessPath, String message, String createUser, Date createDate) {
    this.id = id;
    this.empId = empId;
    this.ntAccount = ntAccount;
    this.loginIp = loginIp;
    this.loginDate = loginDate;
    this.loginStatus = loginStatus;
    this.accessPath = accessPath;
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


  @Column(name = "EMP_ID", length = 50)
  public String getEmpId() {
    return this.empId;
  }

  public void setEmpId(String empId) {
    this.empId = empId;
  }


  @Column(name = "NT_ACCOUNT", length = 100)
  public String getNtAccount() {
    return this.ntAccount;
  }

  public void setNtAccount(String ntAccount) {
    this.ntAccount = ntAccount;
  }


  @Column(name = "LOGIN_IP", length = 200)
  public String getLoginIp() {
    return this.loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }

  @Temporal(TemporalType.DATE)
  @Column(name = "LOGIN_DATE", length = 10)
  public Date getLoginDate() {
    return this.loginDate;
  }

  public void setLoginDate(Date loginDate) {
    this.loginDate = loginDate;
  }


  @Column(name = "LOGIN_STATUS")
  public Boolean getLoginStatus() {
    return this.loginStatus;
  }

  public void setLoginStatus(Boolean loginStatus) {
    this.loginStatus = loginStatus;
  }


  @Column(name = "ACCESS_PATH", length = 1000)
  public String getAccessPath() {
    return this.accessPath;
  }

  public void setAccessPath(String accessPath) {
    this.accessPath = accessPath;
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


