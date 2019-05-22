package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Style;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Style.class)
public interface StyleProjection {
}
