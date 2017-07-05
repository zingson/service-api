package com.ul.biz.wm.service.impl;

import com.ul.biz.wm.mapper.UltabWmOrderinfoMapper;
import com.ul.biz.wm.model.UltabWmOrderinfo;
import com.ul.biz.wm.service.UltabWmOrderinfoService;
import com.ul.core.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Zing on 2017/07/05.
 */
@Service
@Transactional
public class UltabWmOrderinfoServiceImpl extends AbstractService<UltabWmOrderinfo> implements UltabWmOrderinfoService {
    @Resource
    private UltabWmOrderinfoMapper ultabWmOrderinfoMapper;

}
