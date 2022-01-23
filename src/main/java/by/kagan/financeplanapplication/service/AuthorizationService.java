package by.kagan.financeplanapplication.service;

import by.kagan.financeplanapplication.model.Account;
import by.kagan.financeplanapplication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class AuthorizationService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new Account(userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email)));
    }
}
