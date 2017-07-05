package com.ul.biz.wm.mapper;

import com.ul.biz.wm.model.WmCate;
import java.util.List;

public interface WmCateMapper {
    int insert(WmCate record);

    List<WmCate> selectAll();
}