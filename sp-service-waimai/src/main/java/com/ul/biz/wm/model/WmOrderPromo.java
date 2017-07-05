package com.ul.biz.wm.model;

public class WmOrderPromo {
    private String orgId;

    private String mercId;

    private String shopId;

    private String orderId;

    private String actId;

    private Short discountType;

    private Long discountAmount;

    private Long channelRate;

    private Long shopRate;

    private Long agentRate;

    private Long logisticsRate;

    private String discountDesc;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    public Short getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Short discountType) {
        this.discountType = discountType;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Long channelRate) {
        this.channelRate = channelRate;
    }

    public Long getShopRate() {
        return shopRate;
    }

    public void setShopRate(Long shopRate) {
        this.shopRate = shopRate;
    }

    public Long getAgentRate() {
        return agentRate;
    }

    public void setAgentRate(Long agentRate) {
        this.agentRate = agentRate;
    }

    public Long getLogisticsRate() {
        return logisticsRate;
    }

    public void setLogisticsRate(Long logisticsRate) {
        this.logisticsRate = logisticsRate;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc == null ? null : discountDesc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}