package com.mateus_lima.service.tasks.repository;

import com.mateus_lima.service.tasks.domain.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    @Query("SELECT t FROM TASKS t WHERE t.dueDate <= :deadline AND t.notified = false")
    List<TaskEntity> findDueTasksWithinDeadline(LocalDateTime deadline);
}
