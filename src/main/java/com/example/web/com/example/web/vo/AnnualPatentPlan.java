package com.example.web.com.example.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName annual_patent_plan
 */
public class AnnualPatentPlan implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 方案号
     */
    private String programNo;

    /**
     * 申请号
     */
    private String applyNo;

    /**
     * 申请日
     */
    private Date applyDate;

    /**
     * 专利名称
     */
    private String patentName;

    /**
     * 申请人
     */
    private String applyPerson;

    /**
     * 发明人
     */
    private String inventionPerson;

    /**
     * 代理人
     */
    private String proxyPerson;

    /**
     * 是否费减是/否
     */
    private String isFeereduction;

    /**
     * 授权公告号
     */
    private String authorizationNo;

    /**
     * 授权公告日
     */
    private Date authorizationDate;

    /**
     * 证书号
     */
    private String certificateNo;

    /**
     * 授权当年年度
     */
    private String certificateYear;

    /**
     * 法律状态
     */
    private String lawStatus;

    /**
     * 答复/缴费绝限
     */
    private String reply;

    /**
     * 备注
     */
    private String remark;

    /**
     * 答复/年费缴纳日期
     */
    private String replyFinal;

    /**
     * 是否删除
     */
    private String isDeleted;

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 方案号
     */
    public String getProgramNo() {
        return programNo;
    }

    /**
     * 方案号
     */
    public void setProgramNo(String programNo) {
        this.programNo = programNo;
    }

    /**
     * 申请号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 申请号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * 申请日
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 申请日
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 专利名称
     */
    public String getPatentName() {
        return patentName;
    }

    /**
     * 专利名称
     */
    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    /**
     * 申请人
     */
    public String getApplyPerson() {
        return applyPerson;
    }

    /**
     * 申请人
     */
    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    /**
     * 发明人
     */
    public String getInventionPerson() {
        return inventionPerson;
    }

    /**
     * 发明人
     */
    public void setInventionPerson(String inventionPerson) {
        this.inventionPerson = inventionPerson;
    }

    /**
     * 代理人
     */
    public String getProxyPerson() {
        return proxyPerson;
    }

    /**
     * 代理人
     */
    public void setProxyPerson(String proxyPerson) {
        this.proxyPerson = proxyPerson;
    }

    /**
     * 是否费减是/否
     */
    public String getIsFeereduction() {
        return isFeereduction;
    }

    /**
     * 是否费减是/否
     */
    public void setIsFeereduction(String isFeereduction) {
        this.isFeereduction = isFeereduction;
    }

    /**
     * 授权公告号
     */
    public String getAuthorizationNo() {
        return authorizationNo;
    }

    /**
     * 授权公告号
     */
    public void setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
    }

    /**
     * 授权公告日
     */
    public Date getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * 授权公告日
     */
    public void setAuthorizationDate(Date authorizationDate) {
        this.authorizationDate = authorizationDate;
    }

    /**
     * 证书号
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 证书号
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    /**
     * 授权当年年度
     */
    public String getCertificateYear() {
        return certificateYear;
    }

    /**
     * 授权当年年度
     */
    public void setCertificateYear(String certificateYear) {
        this.certificateYear = certificateYear;
    }

    /**
     * 法律状态
     */
    public String getLawStatus() {
        return lawStatus;
    }

    /**
     * 法律状态
     */
    public void setLawStatus(String lawStatus) {
        this.lawStatus = lawStatus;
    }

    /**
     * 答复/缴费绝限
     */
    public String getReply() {
        return reply;
    }

    /**
     * 答复/缴费绝限
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 答复/年费缴纳日期
     */
    public String getReplyFinal() {
        return replyFinal;
    }

    /**
     * 答复/年费缴纳日期
     */
    public void setReplyFinal(String replyFinal) {
        this.replyFinal = replyFinal;
    }

    /**
     * 是否删除
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AnnualPatentPlan other = (AnnualPatentPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProgramNo() == null ? other.getProgramNo() == null : this.getProgramNo().equals(other.getProgramNo()))
            && (this.getApplyNo() == null ? other.getApplyNo() == null : this.getApplyNo().equals(other.getApplyNo()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getPatentName() == null ? other.getPatentName() == null : this.getPatentName().equals(other.getPatentName()))
            && (this.getApplyPerson() == null ? other.getApplyPerson() == null : this.getApplyPerson().equals(other.getApplyPerson()))
            && (this.getInventionPerson() == null ? other.getInventionPerson() == null : this.getInventionPerson().equals(other.getInventionPerson()))
            && (this.getProxyPerson() == null ? other.getProxyPerson() == null : this.getProxyPerson().equals(other.getProxyPerson()))
            && (this.getIsFeereduction() == null ? other.getIsFeereduction() == null : this.getIsFeereduction().equals(other.getIsFeereduction()))
            && (this.getAuthorizationNo() == null ? other.getAuthorizationNo() == null : this.getAuthorizationNo().equals(other.getAuthorizationNo()))
            && (this.getAuthorizationDate() == null ? other.getAuthorizationDate() == null : this.getAuthorizationDate().equals(other.getAuthorizationDate()))
            && (this.getCertificateNo() == null ? other.getCertificateNo() == null : this.getCertificateNo().equals(other.getCertificateNo()))
            && (this.getCertificateYear() == null ? other.getCertificateYear() == null : this.getCertificateYear().equals(other.getCertificateYear()))
            && (this.getLawStatus() == null ? other.getLawStatus() == null : this.getLawStatus().equals(other.getLawStatus()))
            && (this.getReply() == null ? other.getReply() == null : this.getReply().equals(other.getReply()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getReplyFinal() == null ? other.getReplyFinal() == null : this.getReplyFinal().equals(other.getReplyFinal()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProgramNo() == null) ? 0 : getProgramNo().hashCode());
        result = prime * result + ((getApplyNo() == null) ? 0 : getApplyNo().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getPatentName() == null) ? 0 : getPatentName().hashCode());
        result = prime * result + ((getApplyPerson() == null) ? 0 : getApplyPerson().hashCode());
        result = prime * result + ((getInventionPerson() == null) ? 0 : getInventionPerson().hashCode());
        result = prime * result + ((getProxyPerson() == null) ? 0 : getProxyPerson().hashCode());
        result = prime * result + ((getIsFeereduction() == null) ? 0 : getIsFeereduction().hashCode());
        result = prime * result + ((getAuthorizationNo() == null) ? 0 : getAuthorizationNo().hashCode());
        result = prime * result + ((getAuthorizationDate() == null) ? 0 : getAuthorizationDate().hashCode());
        result = prime * result + ((getCertificateNo() == null) ? 0 : getCertificateNo().hashCode());
        result = prime * result + ((getCertificateYear() == null) ? 0 : getCertificateYear().hashCode());
        result = prime * result + ((getLawStatus() == null) ? 0 : getLawStatus().hashCode());
        result = prime * result + ((getReply() == null) ? 0 : getReply().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getReplyFinal() == null) ? 0 : getReplyFinal().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", programNo=").append(programNo);
        sb.append(", applyNo=").append(applyNo);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", patentName=").append(patentName);
        sb.append(", applyPerson=").append(applyPerson);
        sb.append(", inventionPerson=").append(inventionPerson);
        sb.append(", proxyPerson=").append(proxyPerson);
        sb.append(", isFeereduction=").append(isFeereduction);
        sb.append(", authorizationNo=").append(authorizationNo);
        sb.append(", authorizationDate=").append(authorizationDate);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", certificateYear=").append(certificateYear);
        sb.append(", lawStatus=").append(lawStatus);
        sb.append(", reply=").append(reply);
        sb.append(", remark=").append(remark);
        sb.append(", replyFinal=").append(replyFinal);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}