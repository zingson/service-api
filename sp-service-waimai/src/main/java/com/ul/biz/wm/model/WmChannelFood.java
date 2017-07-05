package com.ul.biz.wm.model;

public class WmChannelFood {
    private String orgId;

    private String mercId;

    private String channelId;

    private String foodId;

    private String channelFoodId;

    private Integer priority;

    private Integer stock;

    private Long price;

    private String shopId;

    private String status;

    private Integer initStock;

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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId == null ? null : foodId.trim();
    }

    public String getChannelFoodId() {
        return channelFoodId;
    }

    public void setChannelFoodId(String channelFoodId) {
        this.channelFoodId = channelFoodId == null ? null : channelFoodId.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getInitStock() {
        return initStock;
    }

    public void setInitStock(Integer initStock) {
        this.initStock = initStock;
    }
}