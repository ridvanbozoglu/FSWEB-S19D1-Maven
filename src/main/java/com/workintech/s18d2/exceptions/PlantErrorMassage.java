package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;

public class PlantErrorMassage {
    private String massage;
    private HttpStatus httpStatus;

    public PlantErrorMassage(String massage, HttpStatus httpStatus) {
        this.massage = massage;
        this.httpStatus = httpStatus;
    }
}
