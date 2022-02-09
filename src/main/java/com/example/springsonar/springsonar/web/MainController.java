package com.example.springsonar.springsonar.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/main/")
public class MainController {

    @GetMapping
    Mono<ResponseEntity<String>> helloWorld() {
        final var returnString = "Hello";
        return Mono.justOrEmpty(returnString)
                .map(ResponseEntity::ok);
    }
}
