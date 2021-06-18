/*
 * @(#) WebFluxRouter.java 2020. 11. 20.
 *
 */
package com.tistory.ddoriya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author 이상준
 */
@Configuration
@EnableWebFlux
public class WebFluxRouter {
	@Bean
	public RouterFunction<ServerResponse> getInitalizedRoute(WebFluxHandler handler) {
		return RouterFunctions
				.route(RequestPredicates.GET("/api/user")
				.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::getUser)
				.andRoute(RequestPredicates.POST("/api/user")
						.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::addUser)
				.andRoute(RequestPredicates.PUT("/api/user")
						.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::updateUser)
				.andRoute(RequestPredicates.DELETE("/api/user")
						.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::deleteUser);
	}


}
