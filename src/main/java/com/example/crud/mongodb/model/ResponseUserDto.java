package com.example.crud.mongodb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseUserDto {
    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private List<AutoDto> autos;
}
