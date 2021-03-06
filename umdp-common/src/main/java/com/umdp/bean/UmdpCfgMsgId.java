package com.umdp.bean;
// Generated 2017/8/2  11:34:49 by Hibernate Tools 5.2.3.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UmdpCfgMsgId generated by hbm2java
 */
@Embeddable
public class UmdpCfgMsgId implements java.io.Serializable {


  private String langCd;
  private String msgCd;

  public UmdpCfgMsgId() {}

  public UmdpCfgMsgId(String langCd, String msgCd) {
    this.langCd = langCd;
    this.msgCd = msgCd;
  }



  @Column(name = "LANG_CD", nullable = false, length = 100)
  public String getLangCd() {
    return this.langCd;
  }

  public void setLangCd(String langCd) {
    this.langCd = langCd;
  }


  @Column(name = "MSG_CD", nullable = false, length = 100)
  public String getMsgCd() {
    return this.msgCd;
  }

  public void setMsgCd(String msgCd) {
    this.msgCd = msgCd;
  }


  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof UmdpCfgMsgId))
      return false;
    UmdpCfgMsgId castOther = (UmdpCfgMsgId) other;

    return ((this.getLangCd() == castOther.getLangCd()) || (this.getLangCd() != null
        && castOther.getLangCd() != null && this.getLangCd().equals(castOther.getLangCd())))
        && ((this.getMsgCd() == castOther.getMsgCd()) || (this.getMsgCd() != null
            && castOther.getMsgCd() != null && this.getMsgCd().equals(castOther.getMsgCd())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + (getLangCd() == null ? 0 : this.getLangCd().hashCode());
    result = 37 * result + (getMsgCd() == null ? 0 : this.getMsgCd().hashCode());
    return result;
  }


}


