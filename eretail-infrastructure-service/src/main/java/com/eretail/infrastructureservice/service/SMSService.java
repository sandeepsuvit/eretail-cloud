/**
 * 
 */
package com.eretail.infrastructureservice.service;

import com.eretail.core.dtos.SMSNotificationDto;

/**
 * @author sandeepknair
 *
 */
public interface SMSService {
	/**
	 * Send plain text SMS
	 * 
	 * @param message
	 */
	public void sendAsText(SMSNotificationDto message);
}
