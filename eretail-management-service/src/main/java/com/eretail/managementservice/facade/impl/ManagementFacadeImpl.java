/**
 * 
 */
package com.eretail.managementservice.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eretail.core.entity.User;
import com.eretail.managementservice.facade.ManagementFacade;
import com.eretail.managementservice.service.ManagementService;
import com.needle.dtos.UserDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Component
@Slf4j
public class ManagementFacadeImpl implements ManagementFacade {
	@Autowired
	ManagementService managementService;

	@Override
	public List<UserDto> findAll() {
		log.info("Entering findAll of {}", this.getClass().getName());
		List<UserDto> response = new ArrayList<UserDto>();

		for (User user : managementService.findAll()) {
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(user, userDto);
			response.add(userDto);
		}

		log.info("Exiting findAll of {}", this.getClass().getName());
		return response;
	}

}
