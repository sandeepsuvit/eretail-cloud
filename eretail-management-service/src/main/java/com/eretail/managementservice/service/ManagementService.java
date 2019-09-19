/**
 * 
 */
package com.eretail.managementservice.service;

import java.util.List;

import com.eretail.core.entity.User;

/**
 * @author sandeepknair
 *
 */
public interface ManagementService {
	/**
	 * Get all users
	 * 
	 * @return
	 */
	List<User> findAll();
}
