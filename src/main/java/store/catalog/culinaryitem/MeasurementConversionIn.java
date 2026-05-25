package store.catalog.culinaryitem;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record MeasurementConversionIn (

    String fromUnit,
    String toUnit,
    BigDecimal factor
    
) {}
