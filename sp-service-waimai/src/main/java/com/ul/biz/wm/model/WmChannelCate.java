package com.ul.biz.wm.model;

public class WmChannelCate {
    private String orgId;

    private String mercId;

    private String channelId;

    private String channelCateId;

    private String channelCateName;

    private String cateId;

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

    public String getChannelCateId() {
        return channelCateId;
    }

    public void setChannelCateId(String channelCateId) {
        this.channelCateId = channelCateId == null ? null : channelCateId.trim();
    }

    public String getChannelCateName() {
        return channelCateName;
    }

    public void setChannelCateName(String channelCateName) {
        this.channelCateName = channelCateName == null ? null : channelCateName.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }
}