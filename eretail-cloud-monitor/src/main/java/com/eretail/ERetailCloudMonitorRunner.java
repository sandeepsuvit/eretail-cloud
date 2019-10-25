/**
 * 
 */
package com.eretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author sandeepknair
 *
 */
@EnableAsync
@ComponentScan(basePackages = { "com.eretail" })
// Admin server
@EnableAdminServer
// Register service in the registry
@SpringBootApplication
public class ERetailCloudMonitorRunner {

	/**
	 * Starter method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ERetailCloudMonitorRunner.class, args);
	}

}
