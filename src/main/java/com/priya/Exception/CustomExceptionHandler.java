package com.priya.Exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.priya.model.ErrorDetails;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	public  Logger log=LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	public CustomExceptionHandler(){
		log.debug("Inside the CustomExceptionHandler constructor");
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorDetails> handleNotFoundException(CustomException ex, WebRequest request){
		log.debug("Inside handleNotFoundException"); 
		ErrorDetails errorDetails = new ErrorDetails(new Date(), HttpStatus.NOT_FOUND.value(), ex.getMessage(),
				request.getDescription(false));
		log.debug("Exiting handleNotFoundException"); 
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) {
		log.debug("Inside handleAllExceptions"); 
		ErrorDetails errorDetails = new ErrorDetails(new Date(), HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(),
				request.getDescription(false));
		log.debug("Exiting handleAllExceptions"); 
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
