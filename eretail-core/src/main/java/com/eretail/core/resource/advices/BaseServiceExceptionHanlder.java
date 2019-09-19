/**
 * 
 */
package com.eretail.core.resource.advices;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.eretail.core.exceptions.DataNotFoundException;
import com.eretail.core.exceptions.DisabledUserException;
import com.eretail.core.exceptions.InvalidArgumentException;
import com.needle.dtos.ErrorDetailsDto;

/**
 * @author sandeepknair
 *
 */
public class BaseServiceExceptionHanlder extends ResponseEntityExceptionHandler {
	// TODO: Add custom exception handlers here

	/**
	 * Error type 404 <br/>
	 * Handle not found exceptions
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler({ DataNotFoundException.class })
	public final ResponseEntity<ErrorDetailsDto> handleDataNotFoundException(Exception ex, WebRequest request) {
		// @formatter:off
			    ErrorDetailsDto errorDetails = ErrorDetailsDto
			    		.builder()
			    		.timestamp(new Date())
			    		.status(404)
						.message(ex.getMessage())
						.details(request.getDescription(false))
						.build();
			    // @formatter:on
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	/**
	 * Error type 403 <br/>
	 * Handle forbidden exceptions
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler({ DisabledUserException.class })
	public final ResponseEntity<ErrorDetailsDto> handleDisabledUserException(Exception ex, WebRequest request) {
		// @formatter:off
			    ErrorDetailsDto errorDetails = ErrorDetailsDto
			    		.builder()
			    		.timestamp(new Date())
			    		.status(403)
						.message(ex.getMessage())
						.details(request.getDescription(false))
						.build();
			    // @formatter:on
		return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);
	}

	/**
	 * Error type 400 <br/>
	 * Handle all Illegal arguments
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler({ IllegalArgumentException.class, InvalidArgumentException.class })
	public final ResponseEntity<ErrorDetailsDto> handleIllegalArgumentException(Exception ex, WebRequest request) {
		// @formatter:off
			    ErrorDetailsDto errorDetails = ErrorDetailsDto
			    		.builder()
			    		.timestamp(new Date())
			    		.status(400)
						.message(ex.getMessage())
						.details(request.getDescription(false))
						.build();
			    // @formatter:on
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Error type: 500 <br/>
	 * Handle all generic exceptions
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetailsDto> handleAllExceptions(Exception ex, WebRequest request) {
		// @formatter:off
				ErrorDetailsDto errorDetails = ErrorDetailsDto.builder()
						.timestamp(new Date())
						.status(500)
						.message(ex.getMessage())
						.details(request.getDescription(false))
						.build();
				// @formatter:on
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
