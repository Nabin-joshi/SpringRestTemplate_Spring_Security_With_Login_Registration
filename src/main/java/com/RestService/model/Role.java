package com.RestService.model;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Role {
    private int id;
    private String role;
    private String description;
}
