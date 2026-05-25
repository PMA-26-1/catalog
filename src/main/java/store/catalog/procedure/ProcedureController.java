package store.catalog.procedure;

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
    contextId = "procedureClient",
    url="http://catalog:8080"
)
public interface ProcedureController {

    @PostMapping("/procedures")
    public ResponseEntity<ProcedureOut> createProcedure(
        @RequestBody ProcedureIn in
    );

    @PutMapping("/procedures/{id}")
    public ResponseEntity<ProcedureOut> updateProcedure(
        @PathVariable("id") String id,
        @RequestBody ProcedureIn in
    );

    @DeleteMapping("/procedures/{id}")
    public ResponseEntity<Void> deleteProcedure(
        @PathVariable("id") String id
    );

    @GetMapping("/procedures")
    public ResponseEntity<List<ProcedureOut>> findAllProcedures();

    @GetMapping("/procedures/{id}")
    public ResponseEntity<ProcedureOut> findProcedureById(
        @PathVariable("id") String id
    );
    
}