package com.hyy.backstage.controller;

import com.hyy.backstage.common.api.ApiResult;
import com.hyy.backstage.model.entity.BmsTip;
import com.hyy.backstage.service.BmsTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
@RequestMapping("tip")
public class BmsTipController {
    @Autowired
    private BmsTipService bmsTipService;

    @RequestMapping("/today")
    public ApiResult<BmsTip> getBmsTip() {
        return ApiResult.success(bmsTipService.getBmsTip());
    }

}
