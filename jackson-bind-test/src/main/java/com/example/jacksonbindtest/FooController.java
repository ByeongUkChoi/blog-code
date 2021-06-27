package com.example.jacksonbindtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping
    public FooDto getFoo() {
        return new FooDto();
    }
}
