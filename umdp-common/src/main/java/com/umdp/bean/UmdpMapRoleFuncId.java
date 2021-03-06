package com.umdp.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UmdpMapRoleFuncId generated by hbm2java
 */
@Embeddable
public class UmdpMapRoleFuncId implements java.io.Serializable {


  private String roleCd;
  private String funcCd;

  public UmdpMapRoleFuncId() {}

  public UmdpMapRoleFuncId(String roleCd, String funcCd) {
    this.roleCd = roleCd;
    this.funcCd = funcCd;
  }



  @Column(name = "ROLE_CD", nullable = false, length = 100)
  public String getRoleCd() {
    return this.roleCd;
  }

  public void setRoleCd(String roleCd) {
    this.roleCd = roleCd;
  }


  @Column(name = "FUNC_CD", nullable = false, length = 100)
  public String getFuncCd() {
    return this.funcCd;
  }

  public void setFuncCd(String funcCd) {
    this.funcCd = funcCd;
  }


  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof UmdpMapRoleFuncId))
      return false;
    UmdpMapRoleFuncId castOther = (UmdpMapRoleFuncId) other;

    return ((this.getRoleCd() == castOther.getRoleCd()) || (this.getRoleCd() != null
        && castOther.getRoleCd() != null && this.getRoleCd().equals(castOther.getRoleCd())))
        && ((this.getFuncCd() == castOther.getFuncCd()) || (this.getFuncCd() != null
            && castOther.getFuncCd() != null && this.getFuncCd().equals(castOther.getFuncCd())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + (getRoleCd() == null ? 0 : this.getRoleCd().hashCode());
    result = 37 * result + (getFuncCd() == null ? 0 : this.getFuncCd().hashCode());
    return result;
  }


}


