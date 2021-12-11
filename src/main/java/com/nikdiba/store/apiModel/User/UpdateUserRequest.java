package com.nikdiba.store.apiModel.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequest {

    @NotNull
    private Long id;

    @NotBlank
    private String fullName;

    @Size(min = 6, max = 100)
    private String password;

    @Size(min = 11, max = 11)
    private String phoneNumber;

    @Email
    private String email;
}
