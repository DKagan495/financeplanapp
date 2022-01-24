package by.kagan.financeplanapplication.mapper.request;

import by.kagan.financeplanapplication.domain.User;
import by.kagan.financeplanapplication.request.user.UpdateUserRequest;

public class UpdateUserRequestToUserMapper {
    public User map(UpdateUserRequest source) {

        return User.builder().build();
    }
}
