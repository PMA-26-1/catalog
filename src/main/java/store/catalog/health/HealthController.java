package store.catalog.health;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name="catalog",
    contextId = "healthClient",
    url="http://catalog:8080"
)
public interface HealthController {

    @GetMapping("/health-check")
    public ResponseEntity<Void> healthCheck();
    
}