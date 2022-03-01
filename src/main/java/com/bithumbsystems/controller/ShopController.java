package com.bithumbsystems.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/shop")
public class ShopController {
    @GetMapping("/order")
    public Mono<String> order(final ServerHttpRequest request,
                              final ServerHttpResponse response) {
        log.info("shop Start");
        final HttpHeaders httpHeaders = request.getHeaders();
        httpHeaders.forEach((key, values) -> log.info("{}: {}", key, values));

        log.info("shop End");

        return Mono.just("shop Response");
    }
}
