package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Resource;
import com.example.codeclan.fashion.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedded", types= User.class)
public interface UserProjection {
    long getId();
    String getFirstName();
    String getSurname();
    String getEmail();
    String getPassword();
    String getAccessGroup();
    String getPhoneNumber();
    Resource getResource();
}
