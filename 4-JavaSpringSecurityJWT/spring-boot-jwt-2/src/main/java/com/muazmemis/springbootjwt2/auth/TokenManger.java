package com.muazmemis.springbootjwt2.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

@Service
public class TokenManger {

    private static final String SECRET_KEY = "IncSoft";
    private static final int VALIDITY_IN_MILLISECONDS = 5 * 60 * 1000;

    public String generateToken(String username) {
        Date now = new Date();
        Date validity = new Date(now.getTime() + VALIDITY_IN_MILLISECONDS);

        return Jwts.builder()
                .setSubject(username)
                .setIssuer("www.incsoft.com") // kim imzaladı
                .setIssuedAt(now) // hangi tarihte oluşturuldu
                .setExpiration(validity)
//                .signWith(getKey2(), SignatureAlgorithm.HS256)
                .signWith(getKey())
                .compact();
    }

    public boolean tokenValidate(String token) {
        return getUsernameToken(token) != null && isExpired(token);
    }

    public String getUsernameToken(String token) {
        return getClaims(token).getSubject();
    }

    public boolean isExpired(String token) {
        return getClaims(token).getExpiration().after(new Date());
    }

    public Claims getClaims(String token) {
        long seconds = 3 * 60;
        return Jwts.parserBuilder().setSigningKey(getKey())
//                .setAllowedClockSkewSeconds(seconds)
                .build().parseClaimsJwt(token).getBody();
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private Key getKey2() {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] keyBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);

        return new SecretKeySpec(keyBytes, signatureAlgorithm.getJcaName());
    }

}
