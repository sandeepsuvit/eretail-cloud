/**
 * 
 */
package com.eretail.core.dtos.base;

import org.joda.time.DateTime;

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
public class TimestampDto extends BaseDto {
	private DateTime createdDate;
	private DateTime lastUpdatedDate;
}
