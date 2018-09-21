package com.imooc.manager.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.imooc.manager.controller"})
public class ErrorControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity handleException(Exception e) {
        Map<String, Object> attrs = new HashMap();
        String errorCode = e.getMessage();
        ErrorEnum errorEnum = ErrorEnum.getByCode(errorCode);
        attrs.put("message", errorEnum.getMessage());
        attrs.put("code", errorEnum.getCode());
        attrs.put("canRetry", errorEnum.isCanRetry());
        attrs.put("type", "advice");

        return new ResponseEntity(attrs, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
