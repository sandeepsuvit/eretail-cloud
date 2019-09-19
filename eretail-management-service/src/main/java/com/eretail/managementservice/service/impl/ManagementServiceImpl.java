/**
 * 
 */
package com.eretail.managementservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eretail.core.entity.User;
import com.eretail.managementservice.repository.UserRepository;
import com.eretail.managementservice.service.ManagementService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Service
@Slf4j
public class ManagementServiceImpl implements ManagementService {
	@Autowired
	UserRepository userRepository;
	

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
