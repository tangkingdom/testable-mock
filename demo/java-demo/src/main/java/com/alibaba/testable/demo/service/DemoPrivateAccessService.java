package com.alibaba.testable.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoPrivateAccessService {

    private int count;

    public final Double pi = 3.14;

    /**
     * private method
     */
    private String privateFunc(String s, int i) {
        return s + " - " + i;
    }

    /**
     * method with private field access
     */
    public String privateFieldAccessFunc() {
        count += 2;
        return String.valueOf(count);
    }

}
