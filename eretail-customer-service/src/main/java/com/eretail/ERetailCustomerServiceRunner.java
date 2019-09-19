/**
 * 
 */
package com.eretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author sandeepknair
 *
 */
@EnableAsync
@EntityScan(basePackages = { "com.eretail.core.entity" })
@ComponentScan(basePackages = { "com.eretail" })
// Disable default rest repositories
@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class)
// Register service in the registry
@EnableEurekaClient
@SpringBootApplication
public class ERetailCustomerServiceRunner {

	/**
	 * Starter method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ERetailCustomerServiceRunner.class, args);
	}

}
