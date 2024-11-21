package com.example.techeer_partners_api_session.entity;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 정책
    private Long id;

    @Column(nullable = false) // 빌드 값은 필수
    private String title; // 할 일 제목

    private boolean isDone = false; // 할 일이 들어오면 기본적으로 false

    public Task() { // 기본 생성자 정의

    }

    public Task(String title) { // title을 매개변수로 받는 생성자 정의
        this.title = title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
