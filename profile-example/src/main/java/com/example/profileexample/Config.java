package com.example.profileexample;

import com.example.profileexample.Sender.OtherSender;
import com.example.profileexample.Sender.RealSender;
import com.example.profileexample.Sender.Sender;
import com.example.profileexample.Sender.TestSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("production")
    public Sender productionSender() {
        return new RealSender();
    }

    @Bean
    @Profile({"test", "development"})
    public Sender testSender() {
        return new TestSender();
    }

    @Bean
    @Profile("!production & !development & !test")
    public Sender otherSender() {
        return new OtherSender();
    }
}
