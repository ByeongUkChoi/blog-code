package com.example.other;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DemoApplication.class)
public class OtherTest {
    @Test
    public void otherTest() {
        assertThat(1).isEqualTo(1);
    }
}
