package com.actuatorloggers.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        log.error("Some ERROR log.");
        log.warn("Some WARN log.");
        log.info("Some INFO log.");
        log.debug("Some DEBUG log.");
        log.trace("Some TRACE log.");
        return "Hello World!";
    }

}
