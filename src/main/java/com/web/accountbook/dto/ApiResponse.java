package com.web.accountbook.dto;

import com.web.accountbook.common.code.CommonResult;
import lombok.Data;

@Data
public class ApiResponse {
    public static final ApiResponse OK = new ApiResponse();

    private String resultCode;
    private String resultMessage;

    public ApiResponse() {
        this(CommonResult.E0000);
    }

    public ApiResponse(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public ApiResponse(CommonResult commonResult) {
        this.resultCode = commonResult.getCode();
        this.resultMessage = commonResult.getMessage();
    }

    public static ApiResponse of(CommonResult commonResult) {
        return new ApiResponse(commonResult);
    }
}
