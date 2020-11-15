package com.alex.eurder.exceptions.users;

public class UserAlreadyExistsException extends RuntimeException {
    String message;

    public UserAlreadyExistsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message + " already exists";
    }
}
