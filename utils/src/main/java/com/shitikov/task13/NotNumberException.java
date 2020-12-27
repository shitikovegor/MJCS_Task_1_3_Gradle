package com.shitikov.task13;

public class NotNumberException extends Exception {
    public NotNumberException() {
        super();
    }

    public NotNumberException(String message) {
        super(message);
    }

    public NotNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotNumberException(Throwable cause) {
        super(cause);
    }
}
