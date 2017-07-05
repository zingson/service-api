package com.ul.biz.wm.model;

public class WmPushLog {
    private String orgId;

    private String mercId;

    private String shopId;

    private String termSn;

    private String clientId;

    private String pushPlateId;

    private String pushPlateName;

    private String pushDate;

    private String pushTime;

    private String pushStatus;

    private String pushData;

    private String termType;

    private String remark;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId == null ? null : mercId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getTermSn() {
        return termSn;
    }

    public void setTermSn(String termSn) {
        this.termSn = termSn == null ? null : termSn.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getPushPlateId() {
        return pushPlateId;
    }

    public void setPushPlateId(String pushPlateId) {
        this.pushPlateId = pushPlateId == null ? null : pushPlateId.trim();
    }

    public String getPushPlateName() {
        return pushPlateName;
    }

    public void setPushPlateName(String pushPlateName) {
        this.pushPlateName = pushPlateName == null ? null : pushPlateName.trim();
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate == null ? null : pushDate.trim();
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime == null ? null : pushTime.trim();
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus == null ? null : pushStatus.trim();
    }

    public String getPushData() {
        return pushData;
    }

    public void setPushData(String pushData) {
        this.pushData = pushData == null ? null : pushData.trim();
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType == null ? null : termType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}