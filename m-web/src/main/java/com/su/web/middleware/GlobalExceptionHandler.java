package com.su.web.middleware;

import com.su.web.utils.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Response<Void> handleException(Exception e) {
        return Response.error(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public Response<Void> handleRuntimeException(RuntimeException e) {
        return Response.error(e.getMessage());
    }
}
