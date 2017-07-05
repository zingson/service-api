package com.ul.biz.wm.web;
import com.ul.biz.wm.core.Result;
import com.ul.biz.wm.core.ResultGenerator;
import com.ul.biz.wm.model.UltabWmOrderinfo;
import com.ul.biz.wm.service.UltabWmOrderinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/05.
*/
@RestController
@RequestMapping("/ultab/wm/orderinfo")
public class UltabWmOrderinfoController {
    @Resource
    private UltabWmOrderinfoService ultabWmOrderinfoService;

    @PostMapping("/add")
    public Result add(UltabWmOrderinfo ultabWmOrderinfo) {
        ultabWmOrderinfoService.save(ultabWmOrderinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(Integer id) {
        ultabWmOrderinfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UltabWmOrderinfo ultabWmOrderinfo) {
        ultabWmOrderinfoService.update(ultabWmOrderinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(Integer id) {
        UltabWmOrderinfo ultabWmOrderinfo = ultabWmOrderinfoService.findById(id);
        return ResultGenerator.genSuccessResult(ultabWmOrderinfo);
    }

    @PostMapping("/list")
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<UltabWmOrderinfo> list = ultabWmOrderinfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
