package main.java.service.impl;

import main.java.helloService;

/**
 * Created by Asus on 2017/7/21.
 */
public class helloServiceImpl implements helloService {

    @Override
    public String sayHello() {
        System.out.println("开始");
        String world="你好！世界！";
        return world;
    }
}
