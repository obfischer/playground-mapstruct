package org.example;

import org.apache.commons.lang3.RandomStringUtils;

@org.springframework.stereotype.Service
public class Service {

    public String lookup(String input) {
        return RandomStringUtils.randomAlphabetic(10, 20);
    }
}
