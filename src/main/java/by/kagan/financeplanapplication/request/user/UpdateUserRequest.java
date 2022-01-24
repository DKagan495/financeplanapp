package by.kagan.financeplanapplication.request.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class UpdateUserRequest {

    @NotEmpty
    @Size(min = 2, max = 36)
    private String firstName;

    @NotEmpty
    private String middleName;

    @NotEmpty
    private String lastName;

    private LocalDateTime dateOfBirth;
}
