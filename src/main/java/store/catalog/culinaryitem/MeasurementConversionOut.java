package store.catalog.culinaryitem;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record MeasurementConversionOut (

    String id,
    String fromUnit,
    String toUnit,
    BigDecimal factor
    
) {}
