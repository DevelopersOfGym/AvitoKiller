package ru.practicum.shareit.item.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder(toBuilder = true)
public class ItemDto {
    private Long id;
    @NotBlank()
    private String name;
    @NotBlank()
    private String description;
    @NotNull()
    private Boolean available;
    private Long requestId;
}
