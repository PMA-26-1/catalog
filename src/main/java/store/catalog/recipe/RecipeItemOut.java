package store.catalog.recipe;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record RecipeItemOut (

    String id,
    String culinaryItemId,
    String culinaryItemName,
    BigDecimal quantity,
    String measurementUnit

){}
