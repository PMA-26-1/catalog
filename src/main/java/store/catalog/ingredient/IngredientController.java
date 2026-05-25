package store.catalog.ingredient;

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
    contextId = "ingredientClient",
    url="http://catalog:8080"
)
public interface IngredientController {

    @PostMapping("/ingredients")
    public ResponseEntity<IngredientOut> createIngredient(
        @RequestBody IngredientIn in
    );

    @PutMapping("/ingredients/{id}")
    public ResponseEntity<IngredientOut> updateIngredient(
        @PathVariable("id") String id,
        @RequestBody IngredientIn in
    );

    @DeleteMapping("/ingredients/{id}")
    public ResponseEntity<Void> deleteIngredient(
        @PathVariable("id") String id
    );

    @GetMapping("/ingredients")
    public ResponseEntity<List<IngredientOut>> findAllIngredients();

    @GetMapping("/ingredients/{id}")
    public ResponseEntity<IngredientOut> findIngredientById(
        @PathVariable("id") String id
    );
    
}