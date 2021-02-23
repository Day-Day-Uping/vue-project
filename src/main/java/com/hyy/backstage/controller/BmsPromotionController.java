package com.hyy.backstage.controller;

import com.hyy.backstage.common.api.ApiResult;
import com.hyy.backstage.model.entity.BmsPromotion;
import com.hyy.backstage.service.BmsPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("promote")
@RestController
public class BmsPromotionController {
    @Autowired
    private BmsPromotionService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ApiResult<List<BmsPromotion>> getList() {
        List<BmsPromotion> list = service.getList();
        return ApiResult.success(list);
    }
}
