package com.ul.biz.wm.model;

public class WmTraceLog {
    private String orgId;

    private String mercId;

    private String shopId;

    private String channelId;

    private String transType;

    private String hostDate;

    private String hostTime;

    private String termDate;

    private String termTime;

    private String sessionId;

    private String operId;

    private String requestMsg;

    private String resultMsg;

    private String returnCode;

    private String returnMsg;

    private String hostRetDate;

    private String hostRetTime;

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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getHostDate() {
        return hostDate;
    }

    public void setHostDate(String hostDate) {
        this.hostDate = hostDate == null ? null : hostDate.trim();
    }

    public String getHostTime() {
        return hostTime;
    }

    public void setHostTime(String hostTime) {
        this.hostTime = hostTime == null ? null : hostTime.trim();
    }

    public String getTermDate() {
        return termDate;
    }

    public void setTermDate(String termDate) {
        this.termDate = termDate == null ? null : termDate.trim();
    }

    public String getTermTime() {
        return termTime;
    }

    public void setTermTime(String termTime) {
        this.termTime = termTime == null ? null : termTime.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg == null ? null : requestMsg.trim();
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public String getHostRetDate() {
        return hostRetDate;
    }

    public void setHostRetDate(String hostRetDate) {
        this.hostRetDate = hostRetDate == null ? null : hostRetDate.trim();
    }

    public String getHostRetTime() {
        return hostRetTime;
    }

    public void setHostRetTime(String hostRetTime) {
        this.hostRetTime = hostRetTime == null ? null : hostRetTime.trim();
    }
}