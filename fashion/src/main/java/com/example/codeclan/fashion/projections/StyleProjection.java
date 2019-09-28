package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Style.class)
public interface StyleProjection {
    long getId();
    String getName();
    String getImage();
    double getLabourCost();
    String getSource();
    String getGender();
    List<Fabric> getRecommendedFabrics();
    List<Measurement> getRequiredMeasurements();
    SelectedStyle getSelectedStyle();
}