package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.SelectedStyle;
import com.example.codeclan.fashion.models.Style;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Style.class)
public interface StyleProjection {
    long getId();
    String getName();
    String getImage();
    double getLabourCost();
    String getSource();
    String getGender();
    String getStyleCategory();
//    List<Fabric> getRecommendedFabrics();
//    List<Measurement> getRequiredMeasurements();
    SelectedStyle getSelectedStyle();
}