package store.catalog.ingredient;

import java.util.List;

import lombok.Builder;
import store.catalog.culinaryitem.MeasurementConversionIn;
import store.catalog.culinaryitem.NutritionIn;

@Builder
public record IngredientIn (

    String name,
    String category,
    String iconType,
    NutritionIn nutritionValues,
    List<MeasurementConversionIn> measurementConversions

) {}
