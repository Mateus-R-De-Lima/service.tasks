package com.mateus_lima.service.tasks.scheduling;

import com.mateus_lima.service.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskSchedunling {

    private final TaskService taskService;

    @Scheduled(fixedRate = 360000 * 24)
    public void checkAndNotifyTasks(){
        taskService.sendNotificationForDueTasks();
    }

}
