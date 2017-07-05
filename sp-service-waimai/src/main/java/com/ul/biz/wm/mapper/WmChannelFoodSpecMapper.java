package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmChannelFoodSpec;
import java.util.List;

public interface WmChannelFoodSpecMapper {
    int insert(WmChannelFoodSpec record);

    List<WmChannelFoodSpec> selectAll();
}