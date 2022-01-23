package by.kagan.financeplanapplication.domain;

import by.kagan.financeplanapplication.domain.enumeration.PlanExecutionStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "salary")
    private double salary;

    @Column(name = "left")
    private double left;

    @Column(name = "left_planned")
    private double leftPlanned;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PlanExecutionStatus status;

    @Column(name = "fk_user", insertable = false, updatable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user")
    private User user;
}
