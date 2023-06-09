package com.develop.web.common.view.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/error")
public class ErrorController {

    @GetMapping("/{statusCode}")
    public String getErrorPage(@PathVariable String statusCode){
        return "error/" + statusCode;
    }
}
