package com.jyall.service;

import com.jyall.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wang.linqiao on 2016/11/2.
 */
@Service
public class ProductService {

    @Autowired
    private ProductFeignClient productFeignClient;

    public String getProductList() {
        return productFeignClient.getProductList();
    }
}
