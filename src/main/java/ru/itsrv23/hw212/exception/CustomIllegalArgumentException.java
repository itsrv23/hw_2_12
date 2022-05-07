package ru.itsrv23.hw212.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomIllegalArgumentException extends IllegalArgumentException {
    public CustomIllegalArgumentException(String s) {
        super(s);
    }
}
