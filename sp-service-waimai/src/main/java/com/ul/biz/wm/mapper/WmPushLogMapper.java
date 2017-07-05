package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmPushLog;
import java.util.List;

public interface WmPushLogMapper {
    int insert(WmPushLog record);

    List<WmPushLog> selectAll();
}