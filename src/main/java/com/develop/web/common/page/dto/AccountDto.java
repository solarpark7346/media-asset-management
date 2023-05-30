package com.develop.web.common.page.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccountDto {
    private final String account;
    private final Integer teamId;
}
