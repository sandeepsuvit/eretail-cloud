/**
 * 
 */
package com.eretail.core.enums;

import java.util.HashMap;

import com.eretail.core.enums.base.BaseEnum;

/**
 * @author sandeepknair
 *
 */
public enum Status implements BaseEnum {
	// @formatter:off
	ACTIVE(1001, "Active"), 
	INACTIVE(1002, "Inactive"), 
	DELETED(1003, "Deleted");
	// @formatter:on

	private Long code;

	private String displayName;

	private static HashMap<Long, Status> statusMap = new HashMap<Long, Status>(Status.values().length);

	static {
		for (Status status : Status.values()) {
			statusMap.put(status.code, status);
		}
	}
	
	Status(long code, String displayName) {
		this.code = code;
		this.displayName = displayName;
	}
	
	public static Status getInstanceFromCode(long code) {
		return statusMap.get(code);
	}

	@Override
	public long getClassification() {
		return 1000;
	}

	@Override
	public Long getCode() {
		return code;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

}
