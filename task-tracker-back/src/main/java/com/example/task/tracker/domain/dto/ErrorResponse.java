package com.example.task.tracker.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
