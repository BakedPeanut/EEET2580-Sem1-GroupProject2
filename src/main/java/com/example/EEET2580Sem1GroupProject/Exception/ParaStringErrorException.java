package com.example.EEET2580Sem1GroupProject.Exception;

public class ParaStringErrorException extends RuntimeException{
    public ParaStringErrorException(String message) {
        super(message);
    }

    public ParaStringErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
