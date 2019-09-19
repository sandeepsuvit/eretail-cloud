/**
 * 
 */
package com.eretail.managementservice.facade;

import java.util.List;

import com.needle.dtos.UserDto;

/**
 * @author sandeepknair
 *
 */
public interface ManagementFacade {
	/**
	 * Get all users
	 * 
	 * @return
	 */
	List<UserDto> findAll();
}
