package com.ul.biz.wm.service.impl;

import com.ul.biz.wm.mapper.UltabWmOrderPromoMapper;
import com.ul.biz.wm.model.UltabWmOrderPromo;
import com.ul.biz.wm.service.UltabWmOrderPromoService;
import com.ul.core.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Zing on 2017/07/05.
 */
@Service
@Transactional
public class UltabWmOrderPromoServiceImpl extends AbstractService<UltabWmOrderPromo> implements UltabWmOrderPromoService {
    @Resource
    private UltabWmOrderPromoMapper ultabWmOrderPromoMapper;

}
