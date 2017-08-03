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
 * FsmCfgCrew generated by hbm2java
 */
@Entity
@Table(name = "FSM_CFG_CREW", catalog = "UMDP")
public class FsmCfgCrew implements java.io.Serializable {


  private String employeeNo;
  private String vesselNo;
  private Long headShotFileId;
  private String headShot;
  private String chineseName;
  private String englishNameFirst;
  private String englishNameLast;
  private String nationalityCh;
  private String nationalityEn;
  private Date shippedDate;
  private String shippedPlaceCh;
  private String shippedPlaceEn;
  private Date displacementDate;
  private String agentCh;
  private String agentEn;
  private String rankCh;
  private String rankEn;
  private String rankSeq;
  private Date dob;
  private String seamanBookNo;
  private Date seamanBookExpDate;
  private String sfPassportNo;
  private Date sfPassportExpDate;
  private String passportNo;
  private Date passportExpDate;
  private String australiaMcvNo;
  private Date australiaMcvExpDate;
  private Date contractExpDate;
  private Date planDate;
  private String createUser;
  private Date createDate;
  private String updateUser;
  private Date updateDate;

  public FsmCfgCrew() {}


  public FsmCfgCrew(String employeeNo) {
    this.employeeNo = employeeNo;
  }

  public FsmCfgCrew(String employeeNo, String vesselNo, Long headShotFileId, String headShot,
      String chineseName, String englishNameFirst, String englishNameLast, String nationalityCh,
      String nationalityEn, Date shippedDate, String shippedPlaceCh, String shippedPlaceEn,
      Date displacementDate, String agentCh, String agentEn, String rankCh, String rankEn,
      String rankSeq, Date dob, String seamanBookNo, Date seamanBookExpDate, String sfPassportNo,
      Date sfPassportExpDate, String passportNo, Date passportExpDate, String australiaMcvNo,
      Date australiaMcvExpDate, Date contractExpDate, Date planDate, String createUser,
      Date createDate, String updateUser, Date updateDate) {
    this.employeeNo = employeeNo;
    this.vesselNo = vesselNo;
    this.headShotFileId = headShotFileId;
    this.headShot = headShot;
    this.chineseName = chineseName;
    this.englishNameFirst = englishNameFirst;
    this.englishNameLast = englishNameLast;
    this.nationalityCh = nationalityCh;
    this.nationalityEn = nationalityEn;
    this.shippedDate = shippedDate;
    this.shippedPlaceCh = shippedPlaceCh;
    this.shippedPlaceEn = shippedPlaceEn;
    this.displacementDate = displacementDate;
    this.agentCh = agentCh;
    this.agentEn = agentEn;
    this.rankCh = rankCh;
    this.rankEn = rankEn;
    this.rankSeq = rankSeq;
    this.dob = dob;
    this.seamanBookNo = seamanBookNo;
    this.seamanBookExpDate = seamanBookExpDate;
    this.sfPassportNo = sfPassportNo;
    this.sfPassportExpDate = sfPassportExpDate;
    this.passportNo = passportNo;
    this.passportExpDate = passportExpDate;
    this.australiaMcvNo = australiaMcvNo;
    this.australiaMcvExpDate = australiaMcvExpDate;
    this.contractExpDate = contractExpDate;
    this.planDate = planDate;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateUser = updateUser;
    this.updateDate = updateDate;
  }

  @Id


  @Column(name = "EMPLOYEE_NO", unique = true, nullable = false, length = 5)
  public String getEmployeeNo() {
    return this.employeeNo;
  }

  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  @Column(name = "VESSEL_NO", length = 20)
  public String getVesselNo() {
    return this.vesselNo;
  }

  public void setVesselNo(String vesselNo) {
    this.vesselNo = vesselNo;
  }


  @Column(name = "HEAD_SHOT_FILE_ID")
  public Long getHeadShotFileId() {
    return this.headShotFileId;
  }

  public void setHeadShotFileId(Long headShotFileId) {
    this.headShotFileId = headShotFileId;
  }


  @Column(name = "HEAD_SHOT", length = 100)
  public String getHeadShot() {
    return this.headShot;
  }

  public void setHeadShot(String headShot) {
    this.headShot = headShot;
  }


  @Column(name = "CHINESE_NAME", length = 10)
  public String getChineseName() {
    return this.chineseName;
  }

  public void setChineseName(String chineseName) {
    this.chineseName = chineseName;
  }


  @Column(name = "ENGLISH_NAME_FIRST", length = 50)
  public String getEnglishNameFirst() {
    return this.englishNameFirst;
  }

  public void setEnglishNameFirst(String englishNameFirst) {
    this.englishNameFirst = englishNameFirst;
  }


  @Column(name = "ENGLISH_NAME_LAST", length = 50)
  public String getEnglishNameLast() {
    return this.englishNameLast;
  }

  public void setEnglishNameLast(String englishNameLast) {
    this.englishNameLast = englishNameLast;
  }


  @Column(name = "NATIONALITY_CH", length = 20)
  public String getNationalityCh() {
    return this.nationalityCh;
  }

  public void setNationalityCh(String nationalityCh) {
    this.nationalityCh = nationalityCh;
  }


  @Column(name = "NATIONALITY_EN", length = 20)
  public String getNationalityEn() {
    return this.nationalityEn;
  }

  public void setNationalityEn(String nationalityEn) {
    this.nationalityEn = nationalityEn;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "SHIPPED_DATE", length = 26)
  public Date getShippedDate() {
    return this.shippedDate;
  }

  public void setShippedDate(Date shippedDate) {
    this.shippedDate = shippedDate;
  }


  @Column(name = "SHIPPED_PLACE_CH", length = 100)
  public String getShippedPlaceCh() {
    return this.shippedPlaceCh;
  }

  public void setShippedPlaceCh(String shippedPlaceCh) {
    this.shippedPlaceCh = shippedPlaceCh;
  }


  @Column(name = "SHIPPED_PLACE_EN", length = 100)
  public String getShippedPlaceEn() {
    return this.shippedPlaceEn;
  }

  public void setShippedPlaceEn(String shippedPlaceEn) {
    this.shippedPlaceEn = shippedPlaceEn;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "DISPLACEMENT_DATE", length = 26)
  public Date getDisplacementDate() {
    return this.displacementDate;
  }

  public void setDisplacementDate(Date displacementDate) {
    this.displacementDate = displacementDate;
  }


  @Column(name = "AGENT_CH", length = 20)
  public String getAgentCh() {
    return this.agentCh;
  }

  public void setAgentCh(String agentCh) {
    this.agentCh = agentCh;
  }


  @Column(name = "AGENT_EN", length = 20)
  public String getAgentEn() {
    return this.agentEn;
  }

  public void setAgentEn(String agentEn) {
    this.agentEn = agentEn;
  }


  @Column(name = "RANK_CH", length = 50)
  public String getRankCh() {
    return this.rankCh;
  }

  public void setRankCh(String rankCh) {
    this.rankCh = rankCh;
  }


  @Column(name = "RANK_EN", length = 50)
  public String getRankEn() {
    return this.rankEn;
  }

  public void setRankEn(String rankEn) {
    this.rankEn = rankEn;
  }


  @Column(name = "RANK_SEQ", length = 10)
  public String getRankSeq() {
    return this.rankSeq;
  }

  public void setRankSeq(String rankSeq) {
    this.rankSeq = rankSeq;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "DOB", length = 26)
  public Date getDob() {
    return this.dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }


  @Column(name = "SEAMAN_BOOK_NO", length = 30)
  public String getSeamanBookNo() {
    return this.seamanBookNo;
  }

  public void setSeamanBookNo(String seamanBookNo) {
    this.seamanBookNo = seamanBookNo;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "SEAMAN_BOOK_EXP_DATE", length = 26)
  public Date getSeamanBookExpDate() {
    return this.seamanBookExpDate;
  }

  public void setSeamanBookExpDate(Date seamanBookExpDate) {
    this.seamanBookExpDate = seamanBookExpDate;
  }


  @Column(name = "SF_PASSPORT_NO", length = 30)
  public String getSfPassportNo() {
    return this.sfPassportNo;
  }

  public void setSfPassportNo(String sfPassportNo) {
    this.sfPassportNo = sfPassportNo;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "SF_PASSPORT_EXP_DATE", length = 26)
  public Date getSfPassportExpDate() {
    return this.sfPassportExpDate;
  }

  public void setSfPassportExpDate(Date sfPassportExpDate) {
    this.sfPassportExpDate = sfPassportExpDate;
  }


  @Column(name = "PASSPORT_NO", length = 30)
  public String getPassportNo() {
    return this.passportNo;
  }

  public void setPassportNo(String passportNo) {
    this.passportNo = passportNo;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "PASSPORT_EXP_DATE", length = 26)
  public Date getPassportExpDate() {
    return this.passportExpDate;
  }

  public void setPassportExpDate(Date passportExpDate) {
    this.passportExpDate = passportExpDate;
  }


  @Column(name = "AUSTRALIA_MCV_NO", length = 30)
  public String getAustraliaMcvNo() {
    return this.australiaMcvNo;
  }

  public void setAustraliaMcvNo(String australiaMcvNo) {
    this.australiaMcvNo = australiaMcvNo;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "AUSTRALIA_MCV_EXP_DATE", length = 26)
  public Date getAustraliaMcvExpDate() {
    return this.australiaMcvExpDate;
  }

  public void setAustraliaMcvExpDate(Date australiaMcvExpDate) {
    this.australiaMcvExpDate = australiaMcvExpDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CONTRACT_EXP_DATE", length = 26)
  public Date getContractExpDate() {
    return this.contractExpDate;
  }

  public void setContractExpDate(Date contractExpDate) {
    this.contractExpDate = contractExpDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "PLAN_DATE", length = 26)
  public Date getPlanDate() {
    return this.planDate;
  }

  public void setPlanDate(Date planDate) {
    this.planDate = planDate;
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


