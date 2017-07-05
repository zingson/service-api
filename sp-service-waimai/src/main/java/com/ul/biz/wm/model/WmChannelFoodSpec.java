package com.ul.biz.wm.model;

public class WmChannelFoodSpec {
    private String mercId;

    private String shopId;

    private String channelId;

    private String foodId;

    private String sizeId;

    private Integer price;

    private Integer stock;

    private Integer saleStock;

    private Integer cancelStock;

    private Short status;

    private String updateDate;

    private String updateTime;

    private String updateUser;

    private Integer initStock;

    private String circleType;

    private String channelSpecId;

    private String sizeName;

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

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId == null ? null : foodId.trim();
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId == null ? null : sizeId.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSaleStock() {
        return saleStock;
    }

    public void setSaleStock(Integer saleStock) {
        this.saleStock = saleStock;
    }

    public Integer getCancelStock() {
        return cancelStock;
    }

    public void setCancelStock(Integer cancelStock) {
        this.cancelStock = cancelStock;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getInitStock() {
        return initStock;
    }

    public void setInitStock(Integer initStock) {
        this.initStock = initStock;
    }

    public String getCircleType() {
        return circleType;
    }

    public void setCircleType(String circleType) {
        this.circleType = circleType == null ? null : circleType.trim();
    }

    public String getChannelSpecId() {
        return channelSpecId;
    }

    public void setChannelSpecId(String channelSpecId) {
        this.channelSpecId = channelSpecId == null ? null : channelSpecId.trim();
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }
}