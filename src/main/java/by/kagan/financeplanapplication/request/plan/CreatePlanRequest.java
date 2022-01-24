package by.kagan.financeplanapplication.request.plan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePlanRequest {

    private String name;

    private String description;

    private double salary;

    private double left;

    private double leftPlanned;
}
