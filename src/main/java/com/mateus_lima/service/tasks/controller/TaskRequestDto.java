package com.mateus_lima.service.tasks.controller;

import lombok.Data;

import java.time.LocalDateTime;

public record TaskRequestDto(String title, String email, boolean notified, LocalDateTime dueDate ) {
}
