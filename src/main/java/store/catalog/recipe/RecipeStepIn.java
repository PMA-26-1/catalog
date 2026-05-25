package store.catalog.recipe;

import java.util.List;

import lombok.Builder;

@Builder
public record RecipeStepIn(

    String id, // for parallel steps
    String procedureId,
    Integer estimatedTimeMinutes,
    List<RecipeItemIn> items,
    List<String> prerequisiteStepsIds,
    Integer passiveTimeMinutes

) {}
