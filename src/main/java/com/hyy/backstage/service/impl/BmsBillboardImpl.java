package com.hyy.backstage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyy.backstage.mapper.BmsBillboardMapper;
import com.hyy.backstage.model.entity.BmsBillboard;
import com.hyy.backstage.service.BmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class BmsBillboardImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard> implements BmsBillboardService {
}
