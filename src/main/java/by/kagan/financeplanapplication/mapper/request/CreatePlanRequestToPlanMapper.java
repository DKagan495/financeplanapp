package by.kagan.financeplanapplication.mapper.request;

import by.kagan.financeplanapplication.domain.Plan;
import by.kagan.financeplanapplication.request.plan.CreatePlanRequest;

public class CreatePlanRequestToPlanMapper {

    public Plan map(CreatePlanRequest source) {

        return Plan.builder()
                .name(source.getName())
                .description(source.getDescription())
                .salary(source.getSalary())
                .left(source.getLeft())
                .leftPlanned(source.getLeftPlanned())
                .build();
    }
}
