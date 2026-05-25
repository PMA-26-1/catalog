package store.catalog.recipe;

import java.util.List;

import lombok.Builder;

@Builder
public record RecipeStepOut(

    String id,
    String procedureId,
    String procedureName,
    Integer estimatedTimeMinutes,
    List<RecipeItemOut> items,
    List<String> prerequisiteStepsIds,
    Integer passiveTimeMinutes

) {}
