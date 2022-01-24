package by.kagan.financeplanapplication.request.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

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
    private LocalDate dateOfBirth;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 12)
    private String password;

    private String repeatPassword;
}
