package com.hyy.backstage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyy.backstage.model.entity.BmsPromotion;

import java.util.List;

public interface BmsPromotionMapper extends BaseMapper<BmsPromotion> {

    List<BmsPromotion> getList();
}
