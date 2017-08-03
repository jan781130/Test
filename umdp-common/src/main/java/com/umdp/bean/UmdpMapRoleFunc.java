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
 * UmdpMapRoleFunc generated by hbm2java
 */
@Entity
@Table(name = "UMDP_MAP_ROLE_FUNC", catalog = "UMDP")
public class UmdpMapRoleFunc implements java.io.Serializable {


  private UmdpMapRoleFuncId id;
  private Boolean permRead;
  private Boolean permWrite;
  private Boolean permDelete;
  private Boolean permExport;
  private String createUser;
  private Date createDate;

  public UmdpMapRoleFunc() {}


  public UmdpMapRoleFunc(UmdpMapRoleFuncId id) {
    this.id = id;
  }

  public UmdpMapRoleFunc(UmdpMapRoleFuncId id, Boolean permRead, Boolean permWrite,
      Boolean permDelete, Boolean permExport, String createUser, Date createDate) {
    this.id = id;
    this.permRead = permRead;
    this.permWrite = permWrite;
    this.permDelete = permDelete;
    this.permExport = permExport;
    this.createUser = createUser;
    this.createDate = createDate;
  }

  @EmbeddedId


  @AttributeOverrides({
      @AttributeOverride(name = "roleCd",
          column = @Column(name = "ROLE_CD", nullable = false, length = 100)),
      @AttributeOverride(name = "funcCd",
          column = @Column(name = "FUNC_CD", nullable = false, length = 100))})
  public UmdpMapRoleFuncId getId() {
    return this.id;
  }

  public void setId(UmdpMapRoleFuncId id) {
    this.id = id;
  }


  @Column(name = "PERM_READ")
  public Boolean getPermRead() {
    return this.permRead;
  }

  public void setPermRead(Boolean permRead) {
    this.permRead = permRead;
  }


  @Column(name = "PERM_WRITE")
  public Boolean getPermWrite() {
    return this.permWrite;
  }

  public void setPermWrite(Boolean permWrite) {
    this.permWrite = permWrite;
  }


  @Column(name = "PERM_DELETE")
  public Boolean getPermDelete() {
    return this.permDelete;
  }

  public void setPermDelete(Boolean permDelete) {
    this.permDelete = permDelete;
  }


  @Column(name = "PERM_EXPORT")
  public Boolean getPermExport() {
    return this.permExport;
  }

  public void setPermExport(Boolean permExport) {
    this.permExport = permExport;
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


