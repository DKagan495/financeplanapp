package by.kagan.financeplanapplication.utils;

import by.kagan.financeplanapplication.request.filter.AbstractFilter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Set;

@Component
public class FilterClausesCompleter {

    public void completeWhere(AbstractFilter filter, Set<String> whereClauses, MapSqlParameterSource parameters) {
        Field[] fields = filter.getClass().getFields();

    }

    public void completeOrder(AbstractFilter filter, Set<String> orderByClauses) {

    }

    public void completeJoin(AbstractFilter filter, Set<String> joinClauses, MapSqlParameterSource parameters) {

    }
}
