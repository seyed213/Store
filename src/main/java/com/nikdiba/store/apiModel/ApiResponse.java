package com.nikdiba.store.apiModel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse {

    private final String message;

    private final Object data;

}
