package com.example.EEET2580Sem1GroupProject.Exception;

public class ObjectIdException extends RuntimeException {
    public ObjectIdException(String message) {
        super(message);
    }

    public ObjectIdException(String message, Throwable cause) {
        super(message, cause);
    }
}

