package com.ul.biz.wm.model;

import javax.persistence.*;

@Table(name = "ULTAB_WM_ORDERINFO")
public class UltabWmOrderinfo {
    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "MERC_ID")
    private String mercId;

    @Column(name = "SHOP_ID")
    private String shopId;

    @Column(name = "SHOP_NAME")
    private String shopName;

    @Column(name = "CHANNEL_ORDERID")
    private String channelOrderid;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="traceno")
    //@SequenceGenerator(name = "traceno",sequenceName = "UL_TRACENO" )
    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "VIEW_ORDER_ID")
    private String viewOrderId;

    @Column(name = "TIMESTAMP")
    private String timestamp;

    @Column(name = "ORDER_DATE")
    private String orderDate;

    @Column(name = "ORDER_TIME")
    private String orderTime;

    @Column(name = "CONFIRM_DATE")
    private String confirmDate;

    @Column(name = "CONFIRM_TIME")
    private String confirmTime;

    @Column(name = "TRACE_NO")
    private String traceNo;

    @Column(name = "STATUS")
    private Short status;

    @Column(name = "SEND_IMMEDIATELY")
    private String sendImmediately;

    @Column(name = "EXPECT_DATE")
    private String expectDate;

    @Column(name = "EXPECT_TIME")
    private String expectTime;

    @Column(name = "DELIVER_AMOUNT")
    private Long deliverAmount;

    @Column(name = "PACKAGE_AMOUNT")
    private Long packageAmount;

    @Column(name = "DISCOUNT_AMOUNT")
    private Long discountAmount;

    @Column(name = "SHOP_AMOUNT")
    private Long shopAmount;

    @Column(name = "ORDER_AMOUNT")
    private Long orderAmount;

    @Column(name = "USER_AMOUNT")
    private Long userAmount;

    @Column(name = "PAT_TYPE")
    private String patType;

    @Column(name = "INVOICE_TYPE")
    private Short invoiceType;

    @Column(name = "INVOICE_TITLE")
    private String invoiceTitle;

    @Column(name = "DELIVERY_TYPE")
    private Short deliveryType;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PHONE")
    private String userPhone;

    @Column(name = "USER_SEX")
    private Short userSex;

    @Column(name = "USER_ADDR")
    private String userAddr;

    @Column(name = "LONGITUED_BD")
    private String longituedBd;

    @Column(name = "LATITUED_BD")
    private String latituedBd;

    @Column(name = "LONGITUED_GD")
    private String longituedGd;

    @Column(name = "LATITUED_GD")
    private String latituedGd;

    @Column(name = "SHIPPER_PHONE")
    private String shipperPhone;

    @Column(name = "SHIPPER_NAME")
    private String shipperName;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    @Column(name = "DELIVER_DATE")
    private String deliverDate;

    @Column(name = "DELIVER_TIME")
    private String deliverTime;

    @Column(name = "CANCEL_TYPE")
    private Short cancelType;

    @Column(name = "CANCEL_REASON")
    private String cancelReason;

    @Column(name = "CANCEL_DATE")
    private String cancelDate;

    @Column(name = "CANCEL_TIME")
    private String cancelTime;

    @Column(name = "COMPLETE_DATE")
    private String completeDate;

    @Column(name = "COMPLETE_TIME")
    private String completeTime;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ACT_ID")
    private String actId;

    @Column(name = "DISCOUNT_TYPE")
    private String discountType;

    @Column(name = "CHANNEL_RATE")
    private Long channelRate;

    @Column(name = "SHOP_RATE")
    private Long shopRate;

    @Column(name = "AGENT_RATE")
    private Long agentRate;

    @Column(name = "LOGISTICS_RATE")
    private Long logisticsRate;

    @Column(name = "ORDER_TYPE")
    private Short orderType;

    @Column(name = "UMQ_PROFIT_TYPE")
    private Short umqProfitType;

    @Column(name = "UMQ_PROFIT_AMOUNT")
    private Long umqProfitAmount;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "ORDER_SEQ")
    private Integer orderSeq;

    @Column(name = "AUTO_ORDER")
    private Short autoOrder;

    @Column(name = "DELIVERY_STATUS")
    private Short deliveryStatus;

    @Column(name = "DELIVERY_CNL_REASON")
    private Short deliveryCnlReason;

    @Column(name = "LAST_TRANS_DATE")
    private String lastTransDate;

    @Column(name = "LAST_TRANS_TIME")
    private String lastTransTime;

    @Column(name = "NOTICE_STATUS")
    private Short noticeStatus;

    @Column(name = "SHOP_AUTO_ORDER")
    private Short shopAutoOrder;

    @Column(name = "CHANNEL_SHOP_ID")
    private String channelShopId;

    @Column(name = "STATUS_TEXT")
    private String statusText;

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
     * @return SHOP_NAME
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * @return CHANNEL_ORDERID
     */
    public String getChannelOrderid() {
        return channelOrderid;
    }

    /**
     * @param channelOrderid
     */
    public void setChannelOrderid(String channelOrderid) {
        this.channelOrderid = channelOrderid;
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
     * @return VIEW_ORDER_ID
     */
    public String getViewOrderId() {
        return viewOrderId;
    }

    /**
     * @param viewOrderId
     */
    public void setViewOrderId(String viewOrderId) {
        this.viewOrderId = viewOrderId;
    }

    /**
     * @return TIMESTAMP
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return ORDER_DATE
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return ORDER_TIME
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return CONFIRM_DATE
     */
    public String getConfirmDate() {
        return confirmDate;
    }

    /**
     * @param confirmDate
     */
    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * @return CONFIRM_TIME
     */
    public String getConfirmTime() {
        return confirmTime;
    }

    /**
     * @param confirmTime
     */
    public void setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * @return TRACE_NO
     */
    public String getTraceNo() {
        return traceNo;
    }

    /**
     * @param traceNo
     */
    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    /**
     * @return STATUS
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return SEND_IMMEDIATELY
     */
    public String getSendImmediately() {
        return sendImmediately;
    }

    /**
     * @param sendImmediately
     */
    public void setSendImmediately(String sendImmediately) {
        this.sendImmediately = sendImmediately;
    }

    /**
     * @return EXPECT_DATE
     */
    public String getExpectDate() {
        return expectDate;
    }

    /**
     * @param expectDate
     */
    public void setExpectDate(String expectDate) {
        this.expectDate = expectDate;
    }

    /**
     * @return EXPECT_TIME
     */
    public String getExpectTime() {
        return expectTime;
    }

    /**
     * @param expectTime
     */
    public void setExpectTime(String expectTime) {
        this.expectTime = expectTime;
    }

    /**
     * @return DELIVER_AMOUNT
     */
    public Long getDeliverAmount() {
        return deliverAmount;
    }

    /**
     * @param deliverAmount
     */
    public void setDeliverAmount(Long deliverAmount) {
        this.deliverAmount = deliverAmount;
    }

    /**
     * @return PACKAGE_AMOUNT
     */
    public Long getPackageAmount() {
        return packageAmount;
    }

    /**
     * @param packageAmount
     */
    public void setPackageAmount(Long packageAmount) {
        this.packageAmount = packageAmount;
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
     * @return SHOP_AMOUNT
     */
    public Long getShopAmount() {
        return shopAmount;
    }

    /**
     * @param shopAmount
     */
    public void setShopAmount(Long shopAmount) {
        this.shopAmount = shopAmount;
    }

    /**
     * @return ORDER_AMOUNT
     */
    public Long getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param orderAmount
     */
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * @return USER_AMOUNT
     */
    public Long getUserAmount() {
        return userAmount;
    }

    /**
     * @param userAmount
     */
    public void setUserAmount(Long userAmount) {
        this.userAmount = userAmount;
    }

    /**
     * @return PAT_TYPE
     */
    public String getPatType() {
        return patType;
    }

    /**
     * @param patType
     */
    public void setPatType(String patType) {
        this.patType = patType;
    }

    /**
     * @return INVOICE_TYPE
     */
    public Short getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType
     */
    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * @return INVOICE_TITLE
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * @param invoiceTitle
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * @return DELIVERY_TYPE
     */
    public Short getDeliveryType() {
        return deliveryType;
    }

    /**
     * @param deliveryType
     */
    public void setDeliveryType(Short deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return USER_PHONE
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * @return USER_SEX
     */
    public Short getUserSex() {
        return userSex;
    }

    /**
     * @param userSex
     */
    public void setUserSex(Short userSex) {
        this.userSex = userSex;
    }

    /**
     * @return USER_ADDR
     */
    public String getUserAddr() {
        return userAddr;
    }

    /**
     * @param userAddr
     */
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    /**
     * @return LONGITUED_BD
     */
    public String getLongituedBd() {
        return longituedBd;
    }

    /**
     * @param longituedBd
     */
    public void setLongituedBd(String longituedBd) {
        this.longituedBd = longituedBd;
    }

    /**
     * @return LATITUED_BD
     */
    public String getLatituedBd() {
        return latituedBd;
    }

    /**
     * @param latituedBd
     */
    public void setLatituedBd(String latituedBd) {
        this.latituedBd = latituedBd;
    }

    /**
     * @return LONGITUED_GD
     */
    public String getLongituedGd() {
        return longituedGd;
    }

    /**
     * @param longituedGd
     */
    public void setLongituedGd(String longituedGd) {
        this.longituedGd = longituedGd;
    }

    /**
     * @return LATITUED_GD
     */
    public String getLatituedGd() {
        return latituedGd;
    }

    /**
     * @param latituedGd
     */
    public void setLatituedGd(String latituedGd) {
        this.latituedGd = latituedGd;
    }

    /**
     * @return SHIPPER_PHONE
     */
    public String getShipperPhone() {
        return shipperPhone;
    }

    /**
     * @param shipperPhone
     */
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }

    /**
     * @return SHIPPER_NAME
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * @param shipperName
     */
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    /**
     * @return CHANNEL_ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * @return DELIVER_DATE
     */
    public String getDeliverDate() {
        return deliverDate;
    }

    /**
     * @param deliverDate
     */
    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    /**
     * @return DELIVER_TIME
     */
    public String getDeliverTime() {
        return deliverTime;
    }

    /**
     * @param deliverTime
     */
    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * @return CANCEL_TYPE
     */
    public Short getCancelType() {
        return cancelType;
    }

    /**
     * @param cancelType
     */
    public void setCancelType(Short cancelType) {
        this.cancelType = cancelType;
    }

    /**
     * @return CANCEL_REASON
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * @param cancelReason
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * @return CANCEL_DATE
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * @param cancelDate
     */
    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    /**
     * @return CANCEL_TIME
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * @param cancelTime
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * @return COMPLETE_DATE
     */
    public String getCompleteDate() {
        return completeDate;
    }

    /**
     * @param completeDate
     */
    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }

    /**
     * @return COMPLETE_TIME
     */
    public String getCompleteTime() {
        return completeTime;
    }

    /**
     * @param completeTime
     */
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
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
    public String getDiscountType() {
        return discountType;
    }

    /**
     * @param discountType
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
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
     * @return ORDER_TYPE
     */
    public Short getOrderType() {
        return orderType;
    }

    /**
     * @param orderType
     */
    public void setOrderType(Short orderType) {
        this.orderType = orderType;
    }

    /**
     * @return UMQ_PROFIT_TYPE
     */
    public Short getUmqProfitType() {
        return umqProfitType;
    }

    /**
     * @param umqProfitType
     */
    public void setUmqProfitType(Short umqProfitType) {
        this.umqProfitType = umqProfitType;
    }

    /**
     * @return UMQ_PROFIT_AMOUNT
     */
    public Long getUmqProfitAmount() {
        return umqProfitAmount;
    }

    /**
     * @param umqProfitAmount
     */
    public void setUmqProfitAmount(Long umqProfitAmount) {
        this.umqProfitAmount = umqProfitAmount;
    }

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return ORDER_SEQ
     */
    public Integer getOrderSeq() {
        return orderSeq;
    }

    /**
     * @param orderSeq
     */
    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    /**
     * @return AUTO_ORDER
     */
    public Short getAutoOrder() {
        return autoOrder;
    }

    /**
     * @param autoOrder
     */
    public void setAutoOrder(Short autoOrder) {
        this.autoOrder = autoOrder;
    }

    /**
     * @return DELIVERY_STATUS
     */
    public Short getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * @param deliveryStatus
     */
    public void setDeliveryStatus(Short deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * @return DELIVERY_CNL_REASON
     */
    public Short getDeliveryCnlReason() {
        return deliveryCnlReason;
    }

    /**
     * @param deliveryCnlReason
     */
    public void setDeliveryCnlReason(Short deliveryCnlReason) {
        this.deliveryCnlReason = deliveryCnlReason;
    }

    /**
     * @return LAST_TRANS_DATE
     */
    public String getLastTransDate() {
        return lastTransDate;
    }

    /**
     * @param lastTransDate
     */
    public void setLastTransDate(String lastTransDate) {
        this.lastTransDate = lastTransDate;
    }

    /**
     * @return LAST_TRANS_TIME
     */
    public String getLastTransTime() {
        return lastTransTime;
    }

    /**
     * @param lastTransTime
     */
    public void setLastTransTime(String lastTransTime) {
        this.lastTransTime = lastTransTime;
    }

    /**
     * @return NOTICE_STATUS
     */
    public Short getNoticeStatus() {
        return noticeStatus;
    }

    /**
     * @param noticeStatus
     */
    public void setNoticeStatus(Short noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    /**
     * @return SHOP_AUTO_ORDER
     */
    public Short getShopAutoOrder() {
        return shopAutoOrder;
    }

    /**
     * @param shopAutoOrder
     */
    public void setShopAutoOrder(Short shopAutoOrder) {
        this.shopAutoOrder = shopAutoOrder;
    }

    /**
     * @return CHANNEL_SHOP_ID
     */
    public String getChannelShopId() {
        return channelShopId;
    }

    /**
     * @param channelShopId
     */
    public void setChannelShopId(String channelShopId) {
        this.channelShopId = channelShopId;
    }

    /**
     * @return STATUS_TEXT
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * @param statusText
     */
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}