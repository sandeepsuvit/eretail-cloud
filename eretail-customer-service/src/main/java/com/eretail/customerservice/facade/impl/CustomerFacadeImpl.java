/**
 * 
 */
package com.eretail.customerservice.facade.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eretail.core.entity.User;
import com.eretail.customerservice.facade.CustomerFacade;
import com.eretail.customerservice.request.RegisterCustomerRequest;
import com.eretail.customerservice.service.CustomerService;
import com.needle.dtos.UserDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Component
@Slf4j
public class CustomerFacadeImpl implements CustomerFacade{
	@Autowired
	CustomerService customerService;

	@Override
	public UserDto register(RegisterCustomerRequest request) {
		log.info("Entering register of {}", this.getClass().getName());
		UserDto response = new UserDto();
		User userToPersist = new User();
		
		// Copy properties to save
		BeanUtils.copyProperties(request, userToPersist);
		// Persist the data
		userToPersist = customerService.create(userToPersist);
		// Copy properties after save
		BeanUtils.copyProperties(userToPersist, response);
		
		log.info("Exiting register of {}", this.getClass().getName());
		return response;
	}
}
