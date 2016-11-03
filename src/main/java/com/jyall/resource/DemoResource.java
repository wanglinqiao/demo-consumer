package com.jyall.resource;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang.linqiao on 2016/11/3.
 */
@RestController
@RefreshScope
public class DemoResource {
    @Value("${profile}")
    private String profile;

    @RequestMapping("/hello")
    public String hello(){
        return this.profile;
    }
}
