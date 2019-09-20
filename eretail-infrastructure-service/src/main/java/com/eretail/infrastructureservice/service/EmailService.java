/**
 * 
 */
package com.eretail.infrastructureservice.service;

import com.eretail.core.dtos.EmailNotificationDto;

/**
 * @author sandeepknair
 *
 */
public interface EmailService {
	/**
	 * Send email as plain text
	 * 
	 * @param message
	 */
	public void sendAsText(EmailNotificationDto message);

	/**
	 * Send email as formatted HTML
	 * 
	 * @param message
	 * @param template
	 */
	public void sendAsHtml(EmailNotificationDto message);
}
