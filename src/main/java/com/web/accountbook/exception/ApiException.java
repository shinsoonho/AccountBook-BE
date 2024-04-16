package com.web.accountbook.exception;

import com.web.accountbook.common.code.CommonResult;

public class ApiException extends RuntimeException {

    private CommonResult commonResult;

    public ApiException() {}

    public ApiException(String message) {
        super(message);
    }

    public ApiException(CommonResult commonResult) {
        super(commonResult.getMessage());
        this.commonResult = commonResult;
    }

    public ApiException(Throwable cause, CommonResult commonResult) {
        super(commonResult.getMessage(), cause);
        this.commonResult = commonResult;
    }

}
