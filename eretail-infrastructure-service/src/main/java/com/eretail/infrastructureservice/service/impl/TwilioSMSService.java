/**
 * 
 */
package com.eretail.infrastructureservice.service.impl;

import org.springframework.stereotype.Service;

import com.eretail.core.dtos.SMSNotificationDto;
import com.eretail.infrastructureservice.service.SMSService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Slf4j
@Service
public class TwilioSMSService implements SMSService {

	@Override
	public void sendAsText(SMSNotificationDto message) {
		// TODO Auto-generated method stub

	}

}
