/**
 * 
 */
package com.eretail.infrastructureservice.service.impl;

import org.springframework.stereotype.Service;

import com.eretail.infrastructureservice.service.EmailService;
import com.needle.dtos.EmailNotificationDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sandeepknair
 *
 */
@Slf4j
@Service
public class SendGridEmailService implements EmailService {

	@Override
	public void sendAsText(EmailNotificationDto message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendAsHtml(EmailNotificationDto message) {
		// TODO Auto-generated method stub

	}

}
