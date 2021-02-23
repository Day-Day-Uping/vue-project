package com.hyy.backstage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyy.backstage.mapper.BmsPromotionMapper;
import com.hyy.backstage.model.entity.BmsPromotion;
import com.hyy.backstage.service.BmsPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper, BmsPromotion> implements BmsPromotionService {

    @Autowired
    private BmsPromotionMapper bmsPromotionMapper;

    @Override
    public List<BmsPromotion> getList() {
        return bmsPromotionMapper.getList();
    }
}
