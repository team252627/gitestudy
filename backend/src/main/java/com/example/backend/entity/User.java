package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // DB 테이블 이름을 "users"로 설정
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 ID
    private Long id;

    @Column(nullable = false) // null 허용 안 함
    private String name;

    @Column(nullable = false, unique = true) // null 허용 안 함, 고유 값
    private String email;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
