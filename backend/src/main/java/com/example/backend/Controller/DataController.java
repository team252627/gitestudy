package com.example.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 이 클래스는 REST API를 처리하는 컨트롤러
public class DataController {

    // GET 요청을 처리하는 API 엔드포인트
    @GetMapping("/api/data")
    public String getData() {
        return "Hello from Backend!";
    }
}