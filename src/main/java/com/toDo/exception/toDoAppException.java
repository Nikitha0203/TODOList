package com.toDo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class toDoAppException {
	@ExceptionHandler(RuntimeException.class)
    public String recordNotFound(RuntimeException runtimeException){
        return "Record Not Found In DataBase";
    }

}
