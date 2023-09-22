package com.votez.common.config;

import com.votez.common.util.SnowflakeManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowflakeConfig {

    @Bean
    public SnowflakeManager snowflakeManager() {
        return new SnowflakeManager(1, 1L);
    }
}
