package ru.itsrv23.hw212.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.itsrv23.hw212.exception.CustomIllegalArgumentException;

@ControllerAdvice
public class CustomExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT) //nice xD // Статус возврата ошибки нужно переопределять в хедлере
    @ExceptionHandler(CustomIllegalArgumentException.class)
    public void handleCustomIllegalArgumentException(CustomIllegalArgumentException exception){
        LOGGER.error(exception.getMessage(), exception);
    }
}
