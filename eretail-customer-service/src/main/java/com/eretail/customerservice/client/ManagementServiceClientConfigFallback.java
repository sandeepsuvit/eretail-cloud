/**
 * 
 */
package com.eretail.customerservice.client;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.needle.dtos.UserDto;

import lombok.extern.slf4j.Slf4j;

/**
 * Fallback implementation for the management service client if the service
 * become faulty or unavailable at any time
 * 
 * @author sandeep
 *
 */
@Slf4j
@Component
public class ManagementServiceClientConfigFallback implements ManagementServiceClient {

	@Override
	public List<UserDto> getAllUsers() {
		log.error("Executing fallbak because the service is unavailalbe");
		return Collections.emptyList();
	}

}
