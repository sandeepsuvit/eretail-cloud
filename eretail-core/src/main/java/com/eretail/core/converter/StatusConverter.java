/**
 * 
 */
package com.eretail.core.converter;

import javax.persistence.AttributeConverter;

import com.eretail.core.enums.Status;

/**
 * @author sandeepknair
 *
 */
public class StatusConverter implements AttributeConverter<Status, Long> {

	@Override
	public Long convertToDatabaseColumn(Status attribute) {
		if (null != attribute)
			return attribute.getCode();
		return null;
	}

	@Override
	public Status convertToEntityAttribute(Long dbData) {
		if (null != dbData)
			return Status.getInstanceFromCode(dbData);
		return null;
	}

}
