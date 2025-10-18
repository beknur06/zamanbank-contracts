package com.kz.contracts.dto;

import com.kz.contracts.enums.CardType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CardCreationRequest {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotBlank(message = "Card name is required")
    private String cardName;

    @NotBlank(message = "Card type is required")
    private CardType cardType;

    private String designPreferences;
}