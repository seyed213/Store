package com.nikdiba.store.apiModel.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {

    @Size(min = 6, max = 100)
    private String password;

    @Size(min = 11, max = 11)
    private String phoneNumber;

}
