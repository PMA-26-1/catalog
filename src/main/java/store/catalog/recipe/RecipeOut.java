package store.catalog.recipe;

import java.util.List;

import lombok.Builder;
import store.catalog.culinaryitem.MeasurementConversionOut;
import store.catalog.culinaryitem.NutritionOut;

@Builder
public record RecipeOut (

    String id,
    String name,
    String category,
    String iconType,
    NutritionOut nutritionValues,
    List<MeasurementConversionOut> measurementConversions,
    List<RecipeItemOut> recipeItems,
    List<RecipeStepOut> recipeSteps,
    Integer servings,
    Difficulty difficulty,
    Integer minTimeMinutes, // critical path - infinite cooks
    Integer totalWorkMinutes, // sum of all step times - 1 cook
    String accountId

) {}
