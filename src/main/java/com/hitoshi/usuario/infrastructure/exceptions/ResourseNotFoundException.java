package com.hitoshi.usuario.infrastructure.exceptions;

public class ResourseNotFoundException extends RuntimeException {

    public ResourseNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ResourseNotFoundException (String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
