package com.needle.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * 
 * @author sandeepknair
 *
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDetailsDto {
	private Date timestamp;
	private long status;
	private String message;
	private String details;
}
