package by.kagan.financeplanapplication.request.filter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class UserFilter {

    private String firstName;

    private String middleName;

    private String lastName;

    private LocalDate dateOfBirthFrom;

    private LocalDate dateOfBirthTo;

    private boolean locked;

    private boolean enabled;

    private boolean deleted;
}
