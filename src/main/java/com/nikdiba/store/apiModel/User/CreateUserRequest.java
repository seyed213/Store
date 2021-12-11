package com.nikdiba.store.apiModel.User;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank
    private String fullName;

    @Size(min = 6, max = 100)
    private String password;

    @NotBlank
    private String phoneNumber;

    private String email;

}
