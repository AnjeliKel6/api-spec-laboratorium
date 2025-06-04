package com.api_spec_labor.api_spec_labor.share;

import lombok.Data;

@Data
public class BaseResponse <T> {
    private T data;
    private int code;
    private String status;
    private String message;

    public BaseResponse(T dt){
        data=dt;
        code=200;
        status="success";
        message="success";
    }
}
