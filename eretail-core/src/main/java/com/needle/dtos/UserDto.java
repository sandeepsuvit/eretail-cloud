/**
 * 
 */
package com.needle.dtos;

import com.eretail.core.dtos.base.TimestampDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sandeep
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends TimestampDto {
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
}
