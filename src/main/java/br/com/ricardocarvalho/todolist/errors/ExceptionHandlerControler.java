package br.com.ricardocarvalho.todolist.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Customizando as mensagens de erro(try/catch)
@ControllerAdvice // -> anotação do spring para tratamento de exceções
public class ExceptionHandlerControler {
   
   @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleHttpMessageNotReadableExcpetion(HttpMessageNotReadableException e)  {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMostSpecificCause().getMessage());

    }
}
 