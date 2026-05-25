package store.catalog.recipe;

import java.util.List;

import lombok.Builder;
import store.catalog.culinaryitem.MeasurementConversionIn;

@Builder
public record RecipeIn (

    String name,
    String category,
    String iconType,
    List<MeasurementConversionIn> measurementConversions,
    List<RecipeItemIn> recipeItems,
    List<RecipeStepIn> recipeSteps,
    Integer servings,
    Difficulty difficulty,
    String accountId

) {}
