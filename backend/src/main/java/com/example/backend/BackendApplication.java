package com.example.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶");
        log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶ -- 한미1");
        log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶ -- 승혁1");
        log.debug("충돌 테스트 1");



		SpringApplication.run(BackendApplication.class, args);
	}
}