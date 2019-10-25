/**
 * 
 */
package com.eretail.customerservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eretail.core.exceptions.DataNotFoundException;
import com.eretail.customerservice.client.ManagementServiceClient;
import com.eretail.customerservice.facade.CustomerFacade;
import com.eretail.customerservice.request.RegisterCustomerRequest;
import com.needle.dtos.UserDto;

/**
 * @author sandeepknair
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerFacade customerFacade;

	@Autowired
	private ManagementServiceClient managementServiceClient;

	/**
	 * Greeting message
	 * 
	 * @return
	 */
	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		return new ResponseEntity<String>("Hello from trio customer service", HttpStatus.OK);
	}

	/**
	 * Get the list of all users
	 * 
	 * @return
	 */
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		return ResponseEntity.ok(managementServiceClient.getAllUsers());
	}

	/**
	 * Get the list of all users
	 * 
	 * @return
	 * @throws DataNotFoundException
	 */
	@PostMapping()
	public ResponseEntity<UserDto> register(@RequestBody RegisterCustomerRequest registerUserRequest) {
		return ResponseEntity.ok(customerFacade.register(registerUserRequest));
	}
}
