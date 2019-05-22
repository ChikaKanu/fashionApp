package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Measurement.class)
public interface MeasurementProjection {
}
