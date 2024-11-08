package com.example.schedules.entity;

import com.example.schedules.dto.ScheduleRequestDto;
import com.example.schedules.dto.ScheduleResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

    private Long id;
    private String todo;
    private String writer;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void update(ScheduleRequestDto dto) {
        this.todo = dto.getTodo();
        this.writer = dto.getWriter();
        this.password = dto.getPassword();
        this.updatedAt = LocalDateTime.now();
    }
}
