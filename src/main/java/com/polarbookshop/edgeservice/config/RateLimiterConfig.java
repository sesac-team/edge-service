package com.polarbookshop.edgeservice.config;

import java.security.Principal;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

	@Bean
	KeyResolver keyResolver() {
		// Principal의 이름을 Mono로 감싸서 반환하거나, Principal이 없으면 "anonymous"를 반환합니다.
		return exchange -> exchange.getPrincipal()
				.map(Principal::getName)
				.switchIfEmpty(Mono.just("anonymous"));
	}

}
