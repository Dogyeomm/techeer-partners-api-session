package com.example.techeer_partners_api_session.service;

import com.example.techeer_partners_api_session.dto.TaskRequestDto;
import com.example.techeer_partners_api_session.entity.Task;
import com.example.techeer_partners_api_session.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskRequestDto dto) { // 생성자 함수 정의
        Task task = new Task(dto.getTitle()); // 여기까지는 데베에 저장 안 됨
        taskRepository.save(task); // 데베에 저장하기 위함
    }
}
