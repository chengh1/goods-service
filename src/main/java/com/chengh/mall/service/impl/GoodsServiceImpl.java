package com.chengh.mall.service.impl;

import com.chengh.mall.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @program: goods-service
 * @description:
 * @author: chengh
 * @create: 2020-04-07 16:43
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Override
    public String getGood() {
        return "这是一个商品.";
    }
}
