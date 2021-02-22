package com.hyy.backstage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyy.backstage.mapper.BmsBillboardMapper;
import com.hyy.backstage.mapper.BmsTipMapper;
import com.hyy.backstage.model.entity.BmsBillboard;
import com.hyy.backstage.model.entity.BmsTip;
import com.hyy.backstage.service.BmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BmsTipServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard> implements BmsTipService {

    @Autowired
    private BmsTipMapper bmsTipMapper;

    @Override
    public BmsTip getBmsTip() {
        BmsTip randomTip =null;
        try {
            randomTip= bmsTipMapper.getRandomTip();
        }catch (Exception e){
            log.info(e.getMessage());
        }
        return randomTip;
    }
}
    