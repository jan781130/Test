package com.uming.fsm.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FsmSyncCrewId generated by hbm2java
 */
@Embeddable
public class FsmSyncCrewId implements java.io.Serializable {


  private Date syncDate;
  private String employeeNo;

  public FsmSyncCrewId() {}

  public FsmSyncCrewId(Date syncDate, String employeeNo) {
    this.syncDate = syncDate;
    this.employeeNo = employeeNo;
  }



  @Column(name = "SYNC_DATE", nullable = false, length = 26)
  public Date getSyncDate() {
    return this.syncDate;
  }

  public void setSyncDate(Date syncDate) {
    this.syncDate = syncDate;
  }


  @Column(name = "EMPLOYEE_NO", nullable = false, length = 5)
  public String getEmployeeNo() {
    return this.employeeNo;
  }

  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof FsmSyncCrewId))
      return false;
    FsmSyncCrewId castOther = (FsmSyncCrewId) other;

    return ((this.getSyncDate() == castOther.getSyncDate()) || (this.getSyncDate() != null
        && castOther.getSyncDate() != null && this.getSyncDate().equals(castOther.getSyncDate())))
        && ((this.getEmployeeNo() == castOther.getEmployeeNo())
            || (this.getEmployeeNo() != null && castOther.getEmployeeNo() != null
                && this.getEmployeeNo().equals(castOther.getEmployeeNo())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + (getSyncDate() == null ? 0 : this.getSyncDate().hashCode());
    result = 37 * result + (getEmployeeNo() == null ? 0 : this.getEmployeeNo().hashCode());
    return result;
  }


}


