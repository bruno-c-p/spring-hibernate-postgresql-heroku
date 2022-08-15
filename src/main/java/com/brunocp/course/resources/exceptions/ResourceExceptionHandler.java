package com.brunocp.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.brunocp.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		
		String message = "Resource not found";
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		StandardError error = new StandardError(Instant.now(), status.value(), message, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(error);
	}
}
