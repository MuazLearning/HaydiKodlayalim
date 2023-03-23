package com.muazmemis.springbootjwt2.api;

import com.muazmemis.springbootjwt2.auth.TokenManger;
import com.muazmemis.springbootjwt2.request.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/login")
@Api(tags = "users")
public class AuthController {

    private final TokenManger tokenManger;

    private final AuthenticationManager authenticationManager;

    public AuthController(TokenManger tokenManger, AuthenticationManager authenticationManager) {
        this.tokenManger = tokenManger;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
            return ResponseEntity.ok(tokenManger.generateToken(loginRequest.getUsername()));
        } catch (Exception e) {
            throw e;
        }
    }

}
