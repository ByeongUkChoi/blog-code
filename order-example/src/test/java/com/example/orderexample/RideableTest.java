package com.example.orderexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class RideableTest {
    @Autowired
    List<Rideable> rideList;

    @Test
    public void getRideableTest() {
        assertThat(rideList.get(0).getName(), is(equalTo("Car")));
        assertThat(rideList.get(1).getName(), is(equalTo("Bike")));
    }
}
