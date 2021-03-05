/*
 * @(#) NaverShoppingHandler.java 2020. 11. 20.
 *
 * Copyright 2020. All rights Reserved.
 */
package com.tistory.ddoriya;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 이상준
 */
@Component
@Slf4j
public class WebFluxHandler {

	public Mono<ServerResponse> getUser(ServerRequest request) {
		try {
			//사용자 조회 로직 ....
			Map<String, Object> responseMap = new HashMap<>();
			return ServerResponse.ok().body(Mono.just(responseMap), Map.class);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Mono.just(null), Map.class);
		}
	}

	public Mono<ServerResponse> addUser(ServerRequest request) {
		try {
			//사용자 저장 로직 ....
			Map<String, Object> responseMap = new HashMap<>();
			return ServerResponse.ok().body(Mono.just(responseMap), Map.class);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Mono.just(null), Map.class);
		}
	}

	public Mono<ServerResponse> updateUser(ServerRequest request) {
		try {
			//사용자 수정 로직 ....
			Map<String, Object> responseMap = new HashMap<>();
			return ServerResponse.ok().body(Mono.just(responseMap), Map.class);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Mono.just(null), Map.class);
		}
	}

	public Mono<ServerResponse> deleteUser(ServerRequest request) {
		try {
			//사용자 삭제 로직 ....
			Map<String, Object> responseMap = new HashMap<>();
			return ServerResponse.ok().body(Mono.just(responseMap), Map.class);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Mono.just(null), Map.class);
		}
	}


}
