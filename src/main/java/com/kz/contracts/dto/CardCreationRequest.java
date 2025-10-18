package com.kz.contracts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CardCreationRequest {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotBlank(message = "Card name is required")
    private String cardName;

    private String imagePrompt;
}