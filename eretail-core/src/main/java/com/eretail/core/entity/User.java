/**
 * 
 */
package com.eretail.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.eretail.core.entity.base.TimestampEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sandeepknair
 *
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends TimestampEntity implements Serializable {
	/**
	 * Very important if the resource server is different from the auth server
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email", unique = true)
	private String email;
	
	public User() {
	}
}
