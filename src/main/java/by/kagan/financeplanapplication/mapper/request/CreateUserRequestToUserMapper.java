package by.kagan.financeplanapplication.mapper.request;

import by.kagan.financeplanapplication.domain.User;
import by.kagan.financeplanapplication.request.user.CreateUserRequest;

public class CreateUserRequestToUserMapper {

    public User map(CreateUserRequest source) {

        return User.builder()
                .firstName(source.getFirstName())
                .middleName(source.getMiddleName())
                .lastName(source.getLastName())
                .dateOfBirth(source.getDateOfBirth())
                .email(source.getEmail())
                .password(source.getPassword())
                .build();
    }
}
