/**
 * 
 */
package com.eretail.customerservice.service;

import com.eretail.core.entity.User;

/**
 * @author sandeepknair
 *
 */
public interface CustomerService {

	/**
	 * Create new user
	 * 
	 * @param user
	 * @return
	 */
	User create(User user);
}
