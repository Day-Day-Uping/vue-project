package com.hyy.backstage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyy.backstage.model.entity.BmsTip;

public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();

}
