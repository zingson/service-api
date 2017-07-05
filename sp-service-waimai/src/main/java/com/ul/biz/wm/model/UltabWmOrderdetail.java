package com.ul.biz.wm.model;

import javax.persistence.*;

@Table(name = "ULTAB_WM_ORDERDETAIL")
public class UltabWmOrderdetail {


    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "MERC_ID")
    private String mercId;

    @Column(name = "SHOP_ID")
    private String shopId;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "PROD_ID")
    private String prodId;

    @Column(name = "PROD_NUM")
    private Integer prodNum;

    @Column(name = "PROD_PRICE")
    private Long prodPrice;

    @Column(name = "PROD_AMOUNT")
    private Long prodAmount;

    @Column(name = "PROD_NAME")
    private String prodName;

    @Column(name = "CHANNEL_PROD_ID")
    private String channelProdId;

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
     * @return PROD_ID
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * @param prodId
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * @return PROD_NUM
     */
    public Integer getProdNum() {
        return prodNum;
    }

    /**
     * @param prodNum
     */
    public void setProdNum(Integer prodNum) {
        this.prodNum = prodNum;
    }

    /**
     * @return PROD_PRICE
     */
    public Long getProdPrice() {
        return prodPrice;
    }

    /**
     * @param prodPrice
     */
    public void setProdPrice(Long prodPrice) {
        this.prodPrice = prodPrice;
    }

    /**
     * @return PROD_AMOUNT
     */
    public Long getProdAmount() {
        return prodAmount;
    }

    /**
     * @param prodAmount
     */
    public void setProdAmount(Long prodAmount) {
        this.prodAmount = prodAmount;
    }

    /**
     * @return PROD_NAME
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * @param prodName
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * @return CHANNEL_PROD_ID
     */
    public String getChannelProdId() {
        return channelProdId;
    }

    /**
     * @param channelProdId
     */
    public void setChannelProdId(String channelProdId) {
        this.channelProdId = channelProdId;
    }
}