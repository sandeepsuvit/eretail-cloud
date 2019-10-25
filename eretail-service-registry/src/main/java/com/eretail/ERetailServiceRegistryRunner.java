/**
 * 
 */
package com.eretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sandeepknair
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ERetailServiceRegistryRunner {

	/**
	 * Starter method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ERetailServiceRegistryRunner.class, args);
	}

}
