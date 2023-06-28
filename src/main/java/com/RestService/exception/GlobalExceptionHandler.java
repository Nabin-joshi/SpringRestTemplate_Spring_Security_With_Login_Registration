package com.RestService.exception;


import java.time.LocalDateTime;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ApiError> handleNotFoundException(EntityNotFoundException ex) {
		ApiError apiError =	new ApiError.Builder(EntityNotFoundException.getStatus().value())
				.withMessage(ex.getMessage())
				.withTime(LocalDateTime.now())
				.withDescription("Wrong input or there are no results to show!")
				.build();
		return buildErrorResponse(apiError, HttpStatus.NOT_FOUND);
				
	}
	

	@ExceptionHandler(CustomSqlException.class)
	public ResponseEntity<ApiError> handleCustomSqlException(CustomSqlException cex) {
		ApiError apiError = new ApiError.Builder(cex.getStatus().value())
				.withMessage("Error Occured.")
				.withDescription(cex.getMessage())
				.withTime(LocalDateTime.now())
				.build();
		return buildErrorResponse(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Handles the file storage exception
	 * 
	 */
	@ExceptionHandler(FileStorageException.class)
	public ResponseEntity<ApiError> handleStorageException(FileStorageException stex) {
		ApiError apiError = new ApiError.Builder(FileStorageException.getStatus().value())
				.withMessage("Storage Exception.")
				.withDescription(stex.getMessage())
				.withTime(LocalDateTime.now())
				.build();
		return buildErrorResponse(apiError, FileStorageException.getStatus());
	}
	

	private <T> ResponseEntity<T> buildErrorResponse(T t, HttpStatus status) {
		return new ResponseEntity<>(t, status);
	}
}
