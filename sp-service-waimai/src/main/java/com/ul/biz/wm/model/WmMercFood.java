package com.ul.biz.wm.model;

public class WmMercFood {
    private String orgId;

    private String mercId;

    private String foodId;

    private String foodName;

    private String cateId;

    private Integer priority;

    private String upc;

    private String pic;

    private String picId;

    private String picHash;

    private Short minOrderNum;

    private Short packageNum;

    private String description;

    private String availDate;

    private String availTimeStart;

    private String availTimeEnd;

    private String attrName;

    private String attrValue;

    private Short isNew;

    private Short isFeatured;

    private Short isSpicy;

    private Short isPromoItem;

    private Long oldPrice;

    private Short isJardiniere;

    private String extFoodId;

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

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc == null ? null : upc.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId == null ? null : picId.trim();
    }

    public String getPicHash() {
        return picHash;
    }

    public void setPicHash(String picHash) {
        this.picHash = picHash == null ? null : picHash.trim();
    }

    public Short getMinOrderNum() {
        return minOrderNum;
    }

    public void setMinOrderNum(Short minOrderNum) {
        this.minOrderNum = minOrderNum;
    }

    public Short getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Short packageNum) {
        this.packageNum = packageNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAvailDate() {
        return availDate;
    }

    public void setAvailDate(String availDate) {
        this.availDate = availDate == null ? null : availDate.trim();
    }

    public String getAvailTimeStart() {
        return availTimeStart;
    }

    public void setAvailTimeStart(String availTimeStart) {
        this.availTimeStart = availTimeStart == null ? null : availTimeStart.trim();
    }

    public String getAvailTimeEnd() {
        return availTimeEnd;
    }

    public void setAvailTimeEnd(String availTimeEnd) {
        this.availTimeEnd = availTimeEnd == null ? null : availTimeEnd.trim();
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public Short getIsNew() {
        return isNew;
    }

    public void setIsNew(Short isNew) {
        this.isNew = isNew;
    }

    public Short getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Short isFeatured) {
        this.isFeatured = isFeatured;
    }

    public Short getIsSpicy() {
        return isSpicy;
    }

    public void setIsSpicy(Short isSpicy) {
        this.isSpicy = isSpicy;
    }

    public Short getIsPromoItem() {
        return isPromoItem;
    }

    public void setIsPromoItem(Short isPromoItem) {
        this.isPromoItem = isPromoItem;
    }

    public Long getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Long oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Short getIsJardiniere() {
        return isJardiniere;
    }

    public void setIsJardiniere(Short isJardiniere) {
        this.isJardiniere = isJardiniere;
    }

    public String getExtFoodId() {
        return extFoodId;
    }

    public void setExtFoodId(String extFoodId) {
        this.extFoodId = extFoodId == null ? null : extFoodId.trim();
    }
}