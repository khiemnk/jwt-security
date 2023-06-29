package com.khiemnk.security.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;

    private String lastname;

    private String email;

    private String password;
}
