package store.catalog.procedure;

import lombok.Builder;

@Builder
public record ProcedureOut (
    
    String id,
    String name

) {}
