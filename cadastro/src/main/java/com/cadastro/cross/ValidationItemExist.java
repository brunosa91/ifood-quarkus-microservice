package com.cadastro.cross;

public class ValidationItemExist  extends RuntimeException{

public String campo;

    public ValidationItemExist(String message, String campo) {
        super(message);
        this.campo = campo;
    }
}
