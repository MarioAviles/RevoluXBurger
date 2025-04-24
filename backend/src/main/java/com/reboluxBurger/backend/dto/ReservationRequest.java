package com.reboluxBurger.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReservationRequest {
    private Long id;
    private String description;
    private LocalDateTime date;
    private Long user_id;
}
