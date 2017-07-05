package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmMercFood;
import java.util.List;

public interface WmMercFoodMapper {
    int insert(WmMercFood record);

    List<WmMercFood> selectAll();
}