package by.kagan.financeplanapplication.request.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class UpdateCredentialsRequest {

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;
}
