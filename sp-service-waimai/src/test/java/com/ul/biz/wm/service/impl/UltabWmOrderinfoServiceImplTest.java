package com.ul.biz.wm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ul.biz.wm.model.UltabWmOrderinfo;
import com.ul.biz.wm.service.UltabWmOrderinfoService;
import com.ul.core.utils.BaseJunitTest;
import com.ul.core.utils.UJson;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tk.mybatis.mapper.entity.Condition;


import javax.annotation.Resource;


/**
 * Created by songz on 2017/7/5.
 */
public class UltabWmOrderinfoServiceImplTest extends BaseJunitTest {

    @Resource(name="ultabWmOrderinfoServiceImpl")
    private UltabWmOrderinfoService ultabWmOrderinfoService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void save1() throws Exception {
    }

    @Test
    public void deleteById() throws Exception {
    }

    @Test
    public void deleteByIds() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findBy() throws Exception {
    }

    @Test
    public void findByIds() throws Exception {
    }

    @Test
    public void findByCondition() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        PageHelper.startPage(1,5);
        Condition condition = new Condition(UltabWmOrderinfo.class);
        //condition.createCriteria().andEqualTo("orderDate","20170111");
        condition.createCriteria().andEqualTo("orderId","17011104504881029433");
        //condition.createCriteria().andEqualTo("shopName","宜芝多外卖（测试店3）");
        Page<UltabWmOrderinfo> list = (Page<UltabWmOrderinfo>) ultabWmOrderinfoService.findByCondition(condition);
        System.out.println(list.getTotal());
        System.out.println(UJson.obj2json(list));
    }

}