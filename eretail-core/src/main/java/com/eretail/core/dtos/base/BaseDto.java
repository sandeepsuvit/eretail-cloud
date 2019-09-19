package com.eretail.core.dtos.base;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sandeepknair
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseDto {
	private UUID id;
}
