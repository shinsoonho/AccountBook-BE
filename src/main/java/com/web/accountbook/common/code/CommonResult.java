package com.web.accountbook.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonResult {
    E0000("0000", "성공"),
    E0001("0001", "이미 존재하는 아이디 입니다."),
    E0002("0002", "아이디 또는 비밀번호를 확인해 주세요."),
    E9999("9999", "알 수 없는 에러입니다");

    private String code;
    private String message;
}
