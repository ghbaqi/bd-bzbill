package com.ppio.bd.bzbill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
    int i;

    @GetMapping("/hi")
    public String hi() {
        return "hi i" + i++;
    }
}
