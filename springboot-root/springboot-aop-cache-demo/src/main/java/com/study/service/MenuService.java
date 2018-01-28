package com.study.service;

import com.study.config.ApplicationContextHolder;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cat on 2017-03-12.
 */
@Component
public class MenuService {

    @Cacheable(cacheNames = {"menu"})
    public List<String> getMenuList(){
        System.out.println("");
        System.out.println("mock:get from db");
        return Arrays.asList("article","comment","admin");
    }

    public List<String> getRecommends(){
        MenuService proxy = ApplicationContextHolder.getContext().getBean(MenuService.class);
        return proxy.getMenuList();
    }
}
