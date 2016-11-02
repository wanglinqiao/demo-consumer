package com.jyall.service;

import com.alibaba.fastjson.JSONObject;
import com.jyall.feign.DictFeignClient;
import com.jyall.pojo.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang.linqiao on 2016/10/28.
 */
@Service
public class DictService {
    @Autowired
    private DictFeignClient dictFeignClient;

    public List<Dict> getDictByTypeCode(String type) {
        String listStr = dictFeignClient.getDictByTypeCode(type);
        return JSONObject.parseObject(listStr,List.class);
//        return null;
    }
}
