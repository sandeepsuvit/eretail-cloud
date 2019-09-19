/**
 * 
 */
package com.eretail.customerservice.facade;

import com.eretail.customerservice.request.RegisterCustomerRequest;
import com.needle.dtos.UserDto;

/**
 * @author sandeepknair
 *
 */
public interface CustomerFacade {
	
	/**
	 * Register new users
	 * 
	 * @param user
	 * @return
	 */
	UserDto register(RegisterCustomerRequest user);

}
