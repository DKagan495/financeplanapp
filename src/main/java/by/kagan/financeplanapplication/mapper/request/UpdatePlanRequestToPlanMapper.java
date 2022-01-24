package by.kagan.financeplanapplication.mapper.request;

import by.kagan.financeplanapplication.domain.Plan;
import by.kagan.financeplanapplication.request.plan.UpdatePlanRequest;

public class UpdatePlanRequestToPlanMapper {

    public Plan map(UpdatePlanRequest source) {

        return Plan.builder()
                .id(source.getId())
                .name(source.getName())
                .description(source.getDescription())
                .salary(source.getSalary())
                .left(source.getLeft())
                .leftPlanned(source.getLeftPlanned())
                .status(source.getStatus())
                .userId(source.getUserId())
                .build();
    }
}
