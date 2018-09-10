package com.remcarpediem.groovyengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private HelloService helloService;
}
