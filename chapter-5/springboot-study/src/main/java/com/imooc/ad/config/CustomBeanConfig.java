package com.imooc.ad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Qinyi.
 */
@Configuration
public class CustomBeanConfig {

    /**
     * 1. 使用 public 修饰 @Bean 注解的方法
     * 2. 把 RestTemplate 交由 Spring 容器管理, 使用时可以使用 @Autowired 注解注入
     * 3. 可以方便的对 RestTemplate(Bean) 做属性方面的定制工作
     * */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
