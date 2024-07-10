package com.truongbn.security.dao.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequest {

    @Schema(required = true, example = "sovanthoeun@bizplay.co.kr")
    private String email;

    @Schema(required = true, example = "admin")
    private String password;
}
