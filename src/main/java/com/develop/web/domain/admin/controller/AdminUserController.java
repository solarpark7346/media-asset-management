package com.develop.web.domain.admin.controller;

import com.develop.web.domain.admin.service.DeleteUser;
import com.develop.web.domain.admin.service.UpdateUserAccess;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Tag(name = "어드민 > 인사 관리", description = "인사 / 권한 / 역할")
@Slf4j
@RequestMapping(value = "/admin/user")
public class AdminUserController {
    private final UpdateUserAccess updateUserAccess;
    private final DeleteUser deleteUser;

    @PutMapping("/access/apply/{account}")
    @Operation(summary = "직원 사용자 요청 승인", description = "승인 플래그")
    public void accessCheck(@PathVariable String account){
        updateUserAccess.setAccess(account);
    }

    @PutMapping("/delete/{account}")
    @Operation(summary = "직원 사용자 삭제", description = "삭제 플래그")
    public void userDelete(@PathVariable String account){
        log.info("직원 삭제 "+ account);
        deleteUser.updateUserDeleteFlag(account);
    }

}
