package by.kagan.financeplanapplication.jwt;

import by.kagan.financeplanapplication.service.AuthorizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtFilter extends GenericFilterBean {

    private final JwtProvider jwtProvider;

    private final AuthorizationService authorizationService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (jwtProvider.validateToken(((HttpServletRequest) request).getHeader("Authorization"))) {

        }

        chain.doFilter(request, response);
    }
}
