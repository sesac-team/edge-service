package com.polarbookshop.edgeservice.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

	@Bean
	KeyResolver keyResolver() {
		// 모든 요청에 대해 동일한 키("anonymous")를 사용하여 레이트 리미팅을 적용
		return exchange -> Mono.just("anonymous");
	}

}
