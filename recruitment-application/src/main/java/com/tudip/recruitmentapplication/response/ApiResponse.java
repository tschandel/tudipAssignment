package com.tudip.recruitmentapplication.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private Object message;
    private int status;
    private Object details;

}