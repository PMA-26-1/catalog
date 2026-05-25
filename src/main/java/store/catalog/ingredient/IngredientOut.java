package store.catalog.ingredient;

import java.util.List;

import lombok.Builder;
import store.catalog.culinaryitem.MeasurementConversionOut;
import store.catalog.culinaryitem.NutritionOut;

@Builder
public record IngredientOut (

    String id,
    String name,
    String category,
    String iconType,
    NutritionOut nutritionValues,
    List<MeasurementConversionOut> measurementConversions

) {}
