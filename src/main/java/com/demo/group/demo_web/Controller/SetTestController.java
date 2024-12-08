package com.demo.group.demo_web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetTestController {
    @GetMapping("/api/hello")
    public String test() {
        return "백엔드, 프론트엔드 연동 확인 ▶▶▶▶▶▶ ";
    }
}
