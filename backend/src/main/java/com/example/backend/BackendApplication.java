package com.example.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		log.debug("파일 변경 커밋 확인 ▶▶▶▶▶▶▶▶▶");
		log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶");
		log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶ -- 승혁");
        log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶ -- 승혁2");
        log.debug("git clone 확인 ▶▶▶▶▶▶▶▶▶ -- 한미");
		SpringApplication.run(BackendApplication.class, args);
	}
}