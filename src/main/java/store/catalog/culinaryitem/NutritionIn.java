package store.catalog.culinaryitem;

import java.math.BigDecimal;
import java.util.Map;

import lombok.Builder;

@Builder
public record NutritionIn (

    BigDecimal calories,
    BigDecimal protein,
    BigDecimal fat,
    BigDecimal carbohydrate,
    BigDecimal fiber,
    Map<String, BigDecimal> other

) {}