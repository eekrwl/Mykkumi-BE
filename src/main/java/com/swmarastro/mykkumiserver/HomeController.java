package com.swmarastro.mykkumiserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Hello World~~~~~~~~~~~health check 건강만해다오kkk";
    }
}
