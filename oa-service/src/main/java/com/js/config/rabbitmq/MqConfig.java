package com.js.config.rabbitmq;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 消息队列配置
 * @title MqConfig
 * @since v1.0.0
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.rabbitmq")
public class MqConfig {
    /**
     * 服务器域名或IP
     */
    private String host;

    /**
     * 端口，默认5672
     */
    private int port = 5672;

    /**
     * 用户名，默认guest
     */
    private String username ;

    /**
     * 用户密码，默认guest
     */
    private String password ;

    /**
     * 虚拟目录，默认/
     */
    private String virtualHost = "/";
}

