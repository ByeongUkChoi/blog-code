package com.example.profileexample.Sender;

public class RealSender implements Sender {
    @Override
    public String send() {
        return "This is REAL";
    }
}
