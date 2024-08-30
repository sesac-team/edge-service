package com.polarbookshop.edgeservice.user;

import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;  // List를 임포트

@RestController
public class UserController {

	@GetMapping("user")
	public Mono<User> getUser() {
		// 인증이 제거되었으므로 기본 사용자 정보를 반환
		var user = new User(
				"defaultUser",
				"Default",
				"User",
				List.of("ROLE_USER")  // 기본 역할 설정
		);
		return Mono.just(user);
	}

}
