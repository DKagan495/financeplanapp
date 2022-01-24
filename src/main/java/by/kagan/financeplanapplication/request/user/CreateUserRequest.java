package by.kagan.financeplanapplication.request.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class CreateUserRequest {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String middleName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private LocalDateTime dateOfBirth;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 12)
    private String password;

    private String repeatPassword;
}
