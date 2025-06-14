package com.mateus_lima.service.tasks.controller;

import com.mateus_lima.service.tasks.domain.TaskEntity;
import com.mateus_lima.service.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private  final TaskRepository taskRepository;


    @PostMapping
    public ResponseEntity create(@RequestBody TaskRequestDto requestDto){
        var task = TaskEntity.builder()
                .Title(requestDto.title())
                .notified(requestDto.notified())
                .dueDate(requestDto.dueDate())
                .Email(requestDto.email())
                .build();
        return  ResponseEntity.ok().body(taskRepository.save(task));
    }

}
