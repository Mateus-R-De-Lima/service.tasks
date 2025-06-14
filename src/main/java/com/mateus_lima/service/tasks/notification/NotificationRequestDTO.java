package com.mateus_lima.service.tasks.notification;

import lombok.Builder;

@Builder
public record NotificationRequestDTO (String message,String email){}
