package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmOrderDetail;
import java.util.List;

public interface WmOrderDetailMapper {
    int insert(WmOrderDetail record);

    List<WmOrderDetail> selectAll();
}