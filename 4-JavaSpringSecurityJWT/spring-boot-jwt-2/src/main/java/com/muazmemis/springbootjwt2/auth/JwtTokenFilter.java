package com.muazmemis.springbootjwt2.auth;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {

    private final TokenManger tokenManger;

    public JwtTokenFilter(TokenManger tokenManger) {
        this.tokenManger = tokenManger;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        /*
          "Bearer 123hash456"
         */
        final String authHeader = request.getHeader("Authorization");

        String username = null;
        String token = null;

        if (authHeader != null && authHeader.contains("Bearer")) {
            token = authHeader.substring(7);

            try {
                username = tokenManger.getUsernameToken(token);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (username != null && token != null
                && SecurityContextHolder.getContext().getAuthentication() == null) { // If there is no Authentication with this token before
            if (tokenManger.tokenValidate(token)) {
                UsernamePasswordAuthenticationToken userPassToken =
                        new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
                userPassToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(userPassToken);
            }
        }

        filterChain.doFilter(request, response);
    }

}
