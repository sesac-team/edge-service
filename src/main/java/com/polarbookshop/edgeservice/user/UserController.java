package com.polarbookshop.edgeservice.user;

import reactor.core.publisher.Mono;

// 주석 처리된 보안 관련 import
// import org.springframework.security.core.annotation.AuthenticationPrincipal;
// import org.springframework.security.oauth2.core.oidc.user.OidcUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@GetMapping("user")
	public Mono<User> getUser(/* @AuthenticationPrincipal OidcUser oidcUser */) {
		// 주석 처리된 코드
		// var user = new User(
		// 		oidcUser.getPreferredUsername(),
		// 		oidcUser.getGivenName(),
		// 		oidcUser.getFamilyName(),
		// 		oidcUser.getClaimAsStringList("roles")
		// );
		// return Mono.just(user);

		// 주석 처리로 인한 기본 사용자 반환
		var user = new User("guest", "Guest", "User", List.of("USER"));
		return Mono.just(user);
	}

}
