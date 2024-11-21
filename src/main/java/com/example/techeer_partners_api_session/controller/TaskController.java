package com.example.techeer_partners_api_session.controller;

import java.util.HashMap;
import java.util.Map;
import com.example.techeer_partners_api_session.dto.TaskRequestDto;
import com.example.techeer_partners_api_session.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) { // 생성자를 통해 주입을 받게 됨
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createTask(@RequestBody TaskRequestDto dto) {
        taskService.createTask(dto);
        Map<String, String> response = new HashMap<>();
        response.put("message", "할 일이 정상적으로 생성되었습니다.");
        return ResponseEntity.status(201).body(response);
    }
}
