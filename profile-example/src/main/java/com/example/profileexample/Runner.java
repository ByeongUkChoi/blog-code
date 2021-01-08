package com.example.profileexample;

import com.example.profileexample.Sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    @Autowired
    private Sender sender;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String result = sender.send();
        System.out.println(result);
    }
}
