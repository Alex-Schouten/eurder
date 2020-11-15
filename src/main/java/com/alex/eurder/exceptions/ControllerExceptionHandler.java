package com.alex.eurder.exceptions;

import com.alex.eurder.exceptions.items.ItemNotFoundException;
import com.alex.eurder.exceptions.users.AdminAlreadyExistsException;
import com.alex.eurder.exceptions.users.CustomerAlreadyExistsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    protected void userAlreadyExistsException(CustomerAlreadyExistsException ex, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(AdminAlreadyExistsException.class)
    protected void adminAlreadyExistsException(AdminAlreadyExistsException ex, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(ItemNotFoundException.class)
    protected void itemNotFoundException(ItemNotFoundException ex, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage());
    }

}
