/**
 * 
 */
package com.eretail.apigateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author sandeepknair
 *
 */
@EnableSwagger2
@Configuration
@Primary
public class SwaggerConfig implements SwaggerResourcesProvider {
	@Value(value = "${swagger.enabled}")
	Boolean swaggerEnabled;

	@Autowired
	RouteLocator routeLocator;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).enable(swaggerEnabled).select()
				.apis(RequestHandlerSelectors.basePackage("com.eretail")).paths(PathSelectors.any()).build()
				.pathMapping("/");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Eretail API doc")
				.description("Choose a spec from the top right dropdown to access the apis.")
				.version("0.0.1-SNAPSHOT")
				.contact(new Contact("Sandeep", "https://github.com/sandeepsuvit/eretail-cloud", ""))
				.build();
	}

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
		resources.add(swaggerResource("eretail-api-gateway", "/v2/api-docs", "1.0"));
		routeLocator.getRoutes().forEach(route -> {
			resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
		});
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}

}
