package com.sovanthoeun.security.dao.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    @Schema(required = true, example = "Park")
    private String firstName;

    @Schema(required = true, example = "Jung")
    private String lastName;

    @Schema(required = true, example = "sovanthoeun@bizplay.co.kr")
    private String email;

    @Schema(required = true, example = "admin")
    private String password;
}
