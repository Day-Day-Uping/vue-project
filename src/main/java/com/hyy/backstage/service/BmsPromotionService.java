package com.hyy.backstage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyy.backstage.model.entity.BmsPromotion;

import java.util.List;


public interface BmsPromotionService extends IService<BmsPromotion> {
    List<BmsPromotion> getList();

}
