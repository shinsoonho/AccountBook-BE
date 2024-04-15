package com.web.accountbook.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonResult {
    E0000("0000", "성공");

    private String code;
    private String message;
}
