/**
 * 
 */
package com.eretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sandeepknair
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ERetailApiGatewayRunner {

	/**
	 * Starter method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ERetailApiGatewayRunner.class, args);
	}

}
