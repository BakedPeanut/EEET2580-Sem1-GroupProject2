package com.example.EEET2580Sem1GroupProject.Exception;

public class ParaNumErrorException extends RuntimeException {
    public ParaNumErrorException(String message) {
        super(message);
    }

    public ParaNumErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
