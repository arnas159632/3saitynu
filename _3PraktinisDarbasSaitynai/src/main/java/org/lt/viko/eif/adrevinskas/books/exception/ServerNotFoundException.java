package org.lt.viko.eif.adrevinskas.books.exception;

public class ServerNotFoundException extends RuntimeException{
    public ServerNotFoundException(String message){
        super ("Error: " + message);
    }
}
