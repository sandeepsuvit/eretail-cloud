/**
 * 
 */
package com.eretail.core.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author sandeep
 *
 */
@SuppressWarnings("serial")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class NamedEntity extends TimestampEntity {
	@NotBlank
	@Column(name = "name")
	private String name;
}
