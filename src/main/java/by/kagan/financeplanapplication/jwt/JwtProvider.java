package by.kagan.financeplanapplication.jwt;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Component
public class JwtProvider {

    @Value("${app.jwt.secret-key}")
    private String jwtKey;

    public boolean validateToken(String token) {
        try{
            parseToken(token);

            return true;
        } catch (ExpiredJwtException |
                UnsupportedJwtException |
                MalformedJwtException |
                SignatureException exception) {
            exception.printStackTrace();
        }

        return false;
    }

    public String getEmail(String token) {
        return parseToken(token)
                .getBody()
                .getSubject();
    }

    public String generateAccessToken(String email) {
        Date expiration = Date.from(LocalDateTime.now()
                .plusHours(24)
                .toInstant(ZoneOffset.UTC));

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS512, jwtKey)
                .compact();
    }

    public String generateRefreshToken(String email){
        return null;
    }

    private Jws<Claims> parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(jwtKey)
                .parseClaimsJws(token);
    }
}
