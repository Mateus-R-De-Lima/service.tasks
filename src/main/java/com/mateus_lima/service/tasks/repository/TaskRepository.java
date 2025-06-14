package com.mateus_lima.service.tasks.repository;

import com.mateus_lima.service.tasks.domain.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
