package com.mateus_lima.service.tasks.service;

import com.mateus_lima.service.tasks.domain.TaskEntity;
import com.mateus_lima.service.tasks.notification.NotificationClient;
import com.mateus_lima.service.tasks.notification.NotificationRequestDTO;
import com.mateus_lima.service.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private  final TaskRepository taskRepository;
    private  final NotificationClient notificationClient;

    public void  sendNotificationForDueTasks(){
        LocalDateTime deadline = LocalDateTime.now().plusDays(1);
        List<TaskEntity> tasks =  taskRepository.findDueTasksWithinDeadline(deadline);
        for(TaskEntity taskEntity : tasks){
         var request =  NotificationRequestDTO.builder()
                 .email(taskEntity.getEmail())
                 .message("Sua tarefa:" + taskEntity.getTitle() + " está prestes a vencer")
                 .build();

         notificationClient.sendNotifcation(request);
         taskEntity.setNotified(true);
         taskRepository.save(taskEntity);
        }
    }
}
