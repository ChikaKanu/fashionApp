package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.models.FabricSupplier;
import com.example.codeclan.fashion.models.SelectedStyle;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Fabric.class)
public interface FabricProjection {
    long getId();
    String getPicture();
    double getFabricCost();
    String getColour();
    double getQuantity();
    FabricSupplier getFabricSupplier();
    SelectedStyle getSelectedStyle();
}