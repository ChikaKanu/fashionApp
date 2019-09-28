package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.SelectedStyle;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types= SelectedStyle.class)
public interface SelectedStyleProjection {
}
