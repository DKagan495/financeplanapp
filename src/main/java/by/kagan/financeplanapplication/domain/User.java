package by.kagan.financeplanapplication.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private LocalDateTime dateOfBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "enabled")
    private LocalDateTime enabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "blocked")
    private LocalDateTime blocked;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private LocalDateTime deleted;
}
