package com.ul.biz.wm.service.impl;

import com.ul.biz.wm.mapper.UltabWmOrderdetailMapper;
import com.ul.biz.wm.model.UltabWmOrderdetail;
import com.ul.biz.wm.service.UltabWmOrderdetailService;
import com.ul.core.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Zing on 2017/07/05.
 */
@Service
@Transactional
public class UltabWmOrderdetailServiceImpl extends AbstractService<UltabWmOrderdetail> implements UltabWmOrderdetailService {
    @Resource
    private UltabWmOrderdetailMapper ultabWmOrderdetailMapper;

}
