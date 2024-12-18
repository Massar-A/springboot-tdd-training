package com.training.tdd.dto;

import com.training.tdd.model.Type;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode(callSuper=false)
public class MonsterCreationDTO {
    @NotNull
    private String name;
    @NotNull
    private String image;

    @NotNull
    private Type type;

    @NotNull
    @DecimalMin("1")
    @DecimalMax("200")
    private Integer hp;

    @NotNull
    private String figureCaption;

    private String attackName;
    @DecimalMin("1")
    @DecimalMax("99")
    private Integer attackStrength;
    private String attackDescription;
}
