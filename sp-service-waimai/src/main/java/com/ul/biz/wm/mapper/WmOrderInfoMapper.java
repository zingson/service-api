package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmOrderInfo;
import java.util.List;

public interface WmOrderInfoMapper {
    int insert(WmOrderInfo record);

    List<WmOrderInfo> selectAll();
}