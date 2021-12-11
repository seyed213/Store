package com.nikdiba.store.apiModel.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserResponse {


    private String fullName;
    private String password;
    private String phoneNumber;
    private String email;

}
