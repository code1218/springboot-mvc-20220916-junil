package com.boot.mvc20220916junil.web.controller.api;

import com.boot.mvc20220916junil.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserRestController {

    private final UserRepository userRepository;

    @GetMapping("/users/{userCode}")
    public ResponseEntity<?> getUser() {

        return ResponseEntity.ok().body(null);
    }


}
