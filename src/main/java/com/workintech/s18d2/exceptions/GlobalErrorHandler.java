package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(PlantException.class)
    public ResponseEntity<PlantErrorMassage> throwable(PlantException plantException){
        PlantErrorMassage plantErrorMassage = new PlantErrorMassage(plantException.getMessage(),plantException.getHttpStatus());
        return new ResponseEntity<>(plantErrorMassage, plantException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<PlantErrorMassage> throwable(Exception e){
        PlantErrorMassage plantErrorMassage = new PlantErrorMassage(e.getMessage(),HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(plantErrorMassage, HttpStatus.BAD_REQUEST);
    }
}
