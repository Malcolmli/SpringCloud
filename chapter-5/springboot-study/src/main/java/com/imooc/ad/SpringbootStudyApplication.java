package com.imooc.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringbootStudyApplication {

    /**
     * <h2>SpringBoot 应用入口类</h2>
     * */
	public static void main(String[] args) {

		SpringApplication.run(SpringbootStudyApplication.class, args);
	}
}

