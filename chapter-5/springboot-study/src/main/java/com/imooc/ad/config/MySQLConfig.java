package com.imooc.ad.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Qinyi.
 */
@Data
@Component
@ConfigurationProperties(prefix = "adconf.mysql")
public class MySQLConfig {

    private String host;
    private Integer port;
    private String username;
    private String password;
}
