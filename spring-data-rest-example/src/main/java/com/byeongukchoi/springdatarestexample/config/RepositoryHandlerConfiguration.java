package com.byeongukchoi.springdatarestexample.config;

import com.byeongukchoi.springdatarestexample.event.PostRepositoryEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryHandlerConfiguration {

    @Bean
    PostRepositoryEventHandler postEventHandler() {
        return new PostRepositoryEventHandler();
    }
}
