package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmTraceLog;
import java.util.List;

public interface WmTraceLogMapper {
    int insert(WmTraceLog record);

    List<WmTraceLog> selectAll();
}