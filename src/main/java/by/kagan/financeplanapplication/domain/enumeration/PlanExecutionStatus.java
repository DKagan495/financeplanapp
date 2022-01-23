package by.kagan.financeplanapplication.domain.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanExecutionStatus {

    COMPLETE ("План выполнен успешно"),
    SUCCESS ("Остаток в норме. Расходы не превышены."),
    LEFT_OVER ("Расходы превышены. Остаток меньше запланированного.");

    private String description;
}
