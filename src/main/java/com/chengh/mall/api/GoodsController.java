package com.chengh.mall.api;

import com.chengh.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: goods-service
 * @description:
 * @author: chengh
 * @create: 2020-04-07 16:44
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getGood", method = RequestMethod.GET)
    public String getGood() {
        return goodsService.getGood();
    }
}
