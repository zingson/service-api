package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmChannelCate;
import java.util.List;

public interface WmChannelCateMapper {
    int insert(WmChannelCate record);

    List<WmChannelCate> selectAll();
}