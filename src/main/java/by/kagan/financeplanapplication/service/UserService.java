package by.kagan.financeplanapplication.service;

import by.kagan.financeplanapplication.domain.User;
import by.kagan.financeplanapplication.exception.UserNotFoundException;
import by.kagan.financeplanapplication.repository.UserRepository;
import by.kagan.financeplanapplication.request.filter.UserFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final NamedParameterJdbcTemplate jdbcTemplate;

    private final PasswordEncoder encoder;

    public List<User> getByFilter(UserFilter filter, Pageable pageable) {
        return null;
    }

    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(String.format("User with id=%d not found", id)));
    }

    @Transactional
    public User create(User user) {
        user.setPassword(encoder.encode(user.getPassword()));

        userRepository.save(user);

        return user;
    }

    @Transactional
    public User update(Long id, User user) {
        return user;
    }

    @Transactional
    public void delete(Long id) {

    }


}
