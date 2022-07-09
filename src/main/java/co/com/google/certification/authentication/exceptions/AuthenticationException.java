package co.com.google.certification.authentication.exceptions;

import org.apache.poi.ss.formula.functions.T;

public class AuthenticationException extends AssertionError{

    public static final String THE_AUTHENTICATION_WAS_FAILED="The authentication was failed";

    public AuthenticationException(String message){
        super(message);
    }
    public AuthenticationException(String message, Throwable cause){
        super(message, cause);
    }
}
