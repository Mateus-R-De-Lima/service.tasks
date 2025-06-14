package com.mateus_lima.service.tasks.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "TASKS")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Title;

    private  String Email;

    private LocalDateTime dueDate;

    private  boolean notified;

    @CreationTimestamp
    private LocalDateTime createAt;

}
