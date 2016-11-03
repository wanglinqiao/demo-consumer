package com.jyall.service;

import com.alibaba.fastjson.JSONObject;
import com.jyall.feign.DictFeignClient;
import com.jyall.pojo.Dict;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang.linqiao on 2016/10/28.
 */
@Service
public class DictService {
    private Logger logger= LoggerFactory.getLogger(DictService.class);
    @Autowired
    private DictFeignClient dictFeignClient;

    public List<Dict> getDictByTypeCode(String type) {
        try {
            String listStr = dictFeignClient.getDictByTypeCode(type);
            return JSONObject.parseObject(listStr,List.class);
        }catch (Exception e){
            logger.error("获取字典表信息失败！",e);
        }
        return null;
    }
}
