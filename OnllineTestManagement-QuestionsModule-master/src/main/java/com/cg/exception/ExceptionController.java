package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = NullException.class)
	public ResponseEntity<Object> handleNullException(NullException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}


	@ExceptionHandler(value = AccessDeniedException.class)
	public ResponseEntity<Object> handleValidationException(AccessDeniedException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = WrongValueException.class)
	public ResponseEntity<Object> handleWrongValueException(WrongValueException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}