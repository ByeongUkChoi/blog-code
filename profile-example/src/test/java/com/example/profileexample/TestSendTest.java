package com.example.profileexample;

import com.example.profileexample.Sender.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class TestSendTest {

    @Autowired
    private Sender sender;

    @Test
    public void SendTest() {
        String result = sender.send();
        assertThat(result).isEqualTo("This is TEST");
    }
}
