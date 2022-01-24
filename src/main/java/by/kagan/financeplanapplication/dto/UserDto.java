package by.kagan.financeplanapplication.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class UserDto {
    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String email;

    private LocalDateTime enabled;

    private LocalDateTime deleted;

    private LocalDateTime blocked;
}
