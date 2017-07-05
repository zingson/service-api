package com.ul.biz.wm.model;

import javax.persistence.*;

@Table(name = "ULTAB_WM_ORDER_PROMO")
public class UltabWmOrderPromo {


    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "MERC_ID")
    private String mercId;

    @Column(name = "SHOP_ID")
    private String shopId;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "ACT_ID")
    private String actId;

    @Column(name = "DISCOUNT_TYPE")
    private Short discountType;

    @Column(name = "DISCOUNT_AMOUNT")
    private Long discountAmount;

    @Column(name = "CHANNEL_RATE")
    private Long channelRate;

    @Column(name = "SHOP_RATE")
    private Long shopRate;

    @Column(name = "AGENT_RATE")
    private Long agentRate;

    @Column(name = "LOGISTICS_RATE")
    private Long logisticsRate;

    @Column(name = "DISCOUNT_DESC")
    private String discountDesc;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return MERC_ID
     */
    public String getMercId() {
        return mercId;
    }

    /**
     * @param mercId
     */
    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    /**
     * @return SHOP_ID
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * @return ORDER_ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return ACT_ID
     */
    public String getActId() {
        return actId;
    }

    /**
     * @param actId
     */
    public void setActId(String actId) {
        this.actId = actId;
    }

    /**
     * @return DISCOUNT_TYPE
     */
    public Short getDiscountType() {
        return discountType;
    }

    /**
     * @param discountType
     */
    public void setDiscountType(Short discountType) {
        this.discountType = discountType;
    }

    /**
     * @return DISCOUNT_AMOUNT
     */
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * @param discountAmount
     */
    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * @return CHANNEL_RATE
     */
    public Long getChannelRate() {
        return channelRate;
    }

    /**
     * @param channelRate
     */
    public void setChannelRate(Long channelRate) {
        this.channelRate = channelRate;
    }

    /**
     * @return SHOP_RATE
     */
    public Long getShopRate() {
        return shopRate;
    }

    /**
     * @param shopRate
     */
    public void setShopRate(Long shopRate) {
        this.shopRate = shopRate;
    }

    /**
     * @return AGENT_RATE
     */
    public Long getAgentRate() {
        return agentRate;
    }

    /**
     * @param agentRate
     */
    public void setAgentRate(Long agentRate) {
        this.agentRate = agentRate;
    }

    /**
     * @return LOGISTICS_RATE
     */
    public Long getLogisticsRate() {
        return logisticsRate;
    }

    /**
     * @param logisticsRate
     */
    public void setLogisticsRate(Long logisticsRate) {
        this.logisticsRate = logisticsRate;
    }

    /**
     * @return DISCOUNT_DESC
     */
    public String getDiscountDesc() {
        return discountDesc;
    }

    /**
     * @param discountDesc
     */
    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}