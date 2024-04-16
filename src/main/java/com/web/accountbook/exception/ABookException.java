package com.web.accountbook.exception;

import com.web.accountbook.common.code.CommonResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ABookException extends RuntimeException {

    private CommonResult commonResult;

    public ABookException(CommonResult commonResult) {
        log.info("Exception 1 = {}", commonResult);
        this.commonResult = commonResult;
    }

    public ABookException(String message, CommonResult commonResult) {
        super(message);
        log.info("Exception2");
        this.commonResult = commonResult;
    }

    public ABookException(String message, Throwable cause, CommonResult commonResult) {
        super(message, cause);
        log.info("Exception3");
        this.commonResult = commonResult;
    }

    public ABookException(Throwable cause, CommonResult commonResult) {
        super(cause);
        log.info("Exception4");
        this.commonResult = commonResult;
    }

}
