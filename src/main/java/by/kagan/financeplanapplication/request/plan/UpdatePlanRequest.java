package by.kagan.financeplanapplication.request.plan;

import by.kagan.financeplanapplication.domain.enumeration.PlanExecutionStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdatePlanRequest {

    private Long id;

    private String name;

    private String description;

    private double salary;

    private double left;

    private double leftPlanned;

    private PlanExecutionStatus status;

    private Long userId;


}
