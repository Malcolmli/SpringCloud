package com.imooc.ad.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Qinyi.
 */
@Order(value = 2)
@Component
public class Runner02 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        System.out.println("Running Runner02");
    }
}
