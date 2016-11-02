package com.jyall.resource;

import com.alibaba.fastjson.JSONObject;
import com.jyall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang.linqiao on 2016/11/2.
 */
@Controller
@RequestMapping("/product")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @RequestMapping("/getProductList")
    public String getProductList(Model model){
        String productList = productService.getProductList();
        model.addAttribute("productList", JSONObject.parse(productList));
        return "/product/product_list";
    }
}
