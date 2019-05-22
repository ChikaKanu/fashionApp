package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Fabric;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Fabric.class)
public interface FabricProjection {
}
