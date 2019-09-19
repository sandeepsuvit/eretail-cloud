/**
 * 
 */
package com.eretail.customerservice.request;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author sandeepknair
 *
 */
@Data
public class RegisterCustomerRequest {
	@NotNull
	private String firstName;
	
	private String middleName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String email;
}
