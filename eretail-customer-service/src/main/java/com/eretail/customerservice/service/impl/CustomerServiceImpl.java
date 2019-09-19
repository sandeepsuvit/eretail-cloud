/**
 * 
 */
package com.eretail.customerservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eretail.core.entity.User;
import com.eretail.customerservice.repository.UserRepository;
import com.eretail.customerservice.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

}
