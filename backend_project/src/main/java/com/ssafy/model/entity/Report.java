package com.ssafy.model.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {
    private Long roomId;
    private Long userId;
    private int no1;
    private int no2;
    private int no3;
    private String no4;
    private LocalDateTime createdAt;
}
