package com.apollo.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
		System.out.println("inside secuarity bean");
		return http
				.csrf(ServerHttpSecurity.CsrfSpec::disable).authorizeExchange(exchange -> exchange
						.pathMatchers("/users/register", "/users/login").permitAll()
						.pathMatchers("/users/**", "/music/**").authenticated()
						.anyExchange().authenticated())
				.oauth2ResourceServer(oauth -> oauth.jwt()).build();
	}
}
