/**
 * 
 */
package com.eretail.managementservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eretail.core.exceptions.DataNotFoundException;
import com.eretail.managementservice.facade.ManagementFacade;
import com.needle.dtos.UserDto;

/**
 * @author sandeepknair
 *
 */
@RestController
@RequestMapping("/management")
public class ManagementController {
	@Autowired
	ManagementFacade managementFacade;
	
	/**
	 * Greeting message
	 * 
	 * @return
	 */
	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		return new ResponseEntity<String>("Hello from trio management service", HttpStatus.OK);
	}
	
	/**
	 * Get the list of all users
	 * 
	 * @return
	 * @throws DataNotFoundException
	 */
	@GetMapping()
	public ResponseEntity<List<UserDto>> getAllUsers() throws DataNotFoundException {
		List<UserDto> userDtos = managementFacade.findAll();
		return ResponseEntity.ok(userDtos);
	}

}
