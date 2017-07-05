package com.ul.biz.wm.model;

public class WmFoodSpec {
    private String orgId;

    private String mercId;

    private String foodId;

    private String sizeId;

    private String sizeName;

    private Integer priority;

    private Short status;

    private Integer baiduStock;

    private Integer elmStock;

    private Integer mtStock;

    private Integer baiduPrice;

    private Integer elmPrice;

    private Integer mtPrice;

    private String baiduSpecId;

    private String elmSpecId;

    private String mtSpecId;

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

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getBaiduStock() {
        return baiduStock;
    }

    public void setBaiduStock(Integer baiduStock) {
        this.baiduStock = baiduStock;
    }

    public Integer getElmStock() {
        return elmStock;
    }

    public void setElmStock(Integer elmStock) {
        this.elmStock = elmStock;
    }

    public Integer getMtStock() {
        return mtStock;
    }

    public void setMtStock(Integer mtStock) {
        this.mtStock = mtStock;
    }

    public Integer getBaiduPrice() {
        return baiduPrice;
    }

    public void setBaiduPrice(Integer baiduPrice) {
        this.baiduPrice = baiduPrice;
    }

    public Integer getElmPrice() {
        return elmPrice;
    }

    public void setElmPrice(Integer elmPrice) {
        this.elmPrice = elmPrice;
    }

    public Integer getMtPrice() {
        return mtPrice;
    }

    public void setMtPrice(Integer mtPrice) {
        this.mtPrice = mtPrice;
    }

    public String getBaiduSpecId() {
        return baiduSpecId;
    }

    public void setBaiduSpecId(String baiduSpecId) {
        this.baiduSpecId = baiduSpecId == null ? null : baiduSpecId.trim();
    }

    public String getElmSpecId() {
        return elmSpecId;
    }

    public void setElmSpecId(String elmSpecId) {
        this.elmSpecId = elmSpecId == null ? null : elmSpecId.trim();
    }

    public String getMtSpecId() {
        return mtSpecId;
    }

    public void setMtSpecId(String mtSpecId) {
        this.mtSpecId = mtSpecId == null ? null : mtSpecId.trim();
    }
}