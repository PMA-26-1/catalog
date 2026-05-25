package store.catalog.recipe;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record RecipeItemIn (

    String culinaryItemId,
    BigDecimal quantity,
    String measurementUnit

){}
