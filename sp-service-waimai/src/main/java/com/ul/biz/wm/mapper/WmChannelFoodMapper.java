package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmChannelFood;
import java.util.List;

public interface WmChannelFoodMapper {
    int insert(WmChannelFood record);

    List<WmChannelFood> selectAll();
}