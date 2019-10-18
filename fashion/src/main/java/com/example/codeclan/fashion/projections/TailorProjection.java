package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Address;
import com.example.codeclan.fashion.models.SelectedStyle;
import com.example.codeclan.fashion.models.Tailor;
import com.example.codeclan.fashion.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Tailor.class)
public interface TailorProjection {
    long getId();
    String getFirstName();
    String getSurname();
    User getUserDetail();
    Address getAddress();
    String getCompanyName();
    SelectedStyle getSelectedStyle();
}