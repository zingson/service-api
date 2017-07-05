package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmOrderPromo;
import java.util.List;

public interface WmOrderPromoMapper {
    int insert(WmOrderPromo record);

    List<WmOrderPromo> selectAll();
}