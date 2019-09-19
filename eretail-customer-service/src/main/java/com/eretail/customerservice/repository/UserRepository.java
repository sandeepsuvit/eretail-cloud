/**
 * 
 */
package com.eretail.customerservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eretail.core.entity.User;

/**
 * @author sandeepknair
 *
 */
public interface UserRepository extends JpaRepository<User, UUID> {

}
