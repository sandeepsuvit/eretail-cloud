/**
 * 
 */
package com.eretail.customerservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.eretail.customerservice.config.ManagementServiceClientConfig;
import com.needle.dtos.UserDto;

/**
 * Feing client interface for the Management service Using this client we can
 * call the methods that are part of Management service controller
 * 
 * @author sandeep
 *
 */
@FeignClient(name = "eretail-management-service", configuration = ManagementServiceClientConfig.class, fallback = ManagementServiceClientConfigFallback.class)
public interface ManagementServiceClient {

	/**
	 * Get the list of all users from management service
	 * 
	 * @return
	 */
	@GetMapping("/management")
	public List<UserDto> getAllUsers();

}
