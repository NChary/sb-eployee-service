package com.employee.exceptions;

import javax.persistence.NoResultException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employee.model.ApiResponse;

//Global Exception Handling
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NoResultException.class)
	public ResponseEntity<Object> handleRecordNotFoundException(NoResultException exception){
		
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setExceptionCode("9001");
        apiResponse.setExceptionMessage("Employee Not found");
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
	}

}
