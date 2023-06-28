package com.example.cdstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Moritz Halbritter
 */
@RestController
class MyController {
    @GetMapping("/")
    String hello() {
        return "Hello world";
    }
}
