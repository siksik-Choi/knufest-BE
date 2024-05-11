package LlikelionKNU.KNUfest.global.error;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NoExistException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorMessage> NoExistException(NoExistException ex){
            ErrorMessage message = ErrorMessage.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .timeStamp(new Date())
                .build();

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

    @ExceptionHandler(PasswordWrongException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<ErrorMessage> PasswordWrongException(PasswordWrongException ex){
            ErrorMessage message = ErrorMessage.builder()
                    .status(HttpStatus.NOT_ACCEPTABLE.value())
                    .message(ex.getMessage())
                    .timeStamp(new Date())
                    .build();

            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(message);
    }
}
