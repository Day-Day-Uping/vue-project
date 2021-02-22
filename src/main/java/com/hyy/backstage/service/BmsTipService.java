package com.hyy.backstage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyy.backstage.model.entity.BmsBillboard;
import com.hyy.backstage.model.entity.BmsTip;

public interface BmsTipService extends IService<BmsBillboard> {
    BmsTip getBmsTip();
}
