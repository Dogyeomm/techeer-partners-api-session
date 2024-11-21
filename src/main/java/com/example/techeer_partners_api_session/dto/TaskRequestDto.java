package com.example.techeer_partners_api_session.dto;

public class TaskRequestDto {
    // 실제로 요청에 필요한 필드들만 정리해 주면 됨
    private final String title;
    private final boolean isDone;

    public TaskRequestDto(String title, boolean isDone) {
        this.title = title;
        this.isDone = isDone;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() { // isDone 생성자 정의
        return isDone;
    }
}
