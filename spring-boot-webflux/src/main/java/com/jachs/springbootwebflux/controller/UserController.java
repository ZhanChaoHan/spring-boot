package com.jachs.springbootwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/***
 * 
 * @author zhanchaohan
 *
 */
@RestController
public class UserController {
	
	 @GetMapping("/user")
     public Mono<String> getUser() {
         return Mono.just("Welcome to reactive world ~");
     }
}
