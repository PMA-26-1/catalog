package store.catalog.recipe;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name="catalog",
    contextId = "recipeClient",
    url="http://catalog:8080"
)
public interface RecipeController {

    @PostMapping("/recipes")
    public ResponseEntity<RecipeOut> createRecipe(
        @RequestBody RecipeIn in
    );

    @PutMapping("/recipes/{id}")
    public ResponseEntity<RecipeOut> updateRecipe(
        @PathVariable("id") String id,
        @RequestBody RecipeIn in
    );

    @DeleteMapping("/recipes/{id}")
    public ResponseEntity<Void> deleteRecipe(
        @PathVariable("id") String id
    );

    @GetMapping("/recipes")
    public ResponseEntity<List<RecipeOut>> findAllRecipes();

    @GetMapping("/recipes/{id}")
    public ResponseEntity<RecipeOut> findRecipeById(
        @PathVariable("id") String id
    );

    @GetMapping("/recipes/account/{accountId}")
    public ResponseEntity<List<RecipeOut>> findRecipesByAccountId(
        @PathVariable("accountId") String accountId
    );
    
}