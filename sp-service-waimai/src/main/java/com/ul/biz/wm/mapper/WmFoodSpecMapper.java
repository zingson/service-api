package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmFoodSpec;
import java.util.List;

public interface WmFoodSpecMapper {
    int insert(WmFoodSpec record);

    List<WmFoodSpec> selectAll();
}